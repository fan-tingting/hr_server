package com.fanfan.hr.interceptor;

import com.fanfan.hr.annotation.LoginRequired;
import com.fanfan.hr.common.util.RedisUtil;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.lang.reflect.Method;

public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //如果不是映射到方法，直接通过
        if(!(handler instanceof HandlerMethod)) {
            return true;
        }
        //方法注解级拦截器
        HandlerMethod handlerMethod = (HandlerMethod)handler;
        Method method = handlerMethod.getMethod();
        LoginRequired loginAnnotation = method.getAnnotation(LoginRequired.class);
        //需要验证
        if(loginAnnotation != null) {
            try{
                String token = request.getHeader("token").toString();
                String userId = request.getHeader("userId").toString();
                if(StringUtils.isNullOrEmpty(token) || StringUtils.isNullOrEmpty(userId)) {
                    printContent(response,"请重新登录");
                    return false;
                }
                String storeToken = redisUtil.get(userId);
                if(StringUtils.isNullOrEmpty(storeToken)) {
                    printContent(response,"用户登录凭证过期，请重新登录");
                    return false;
                }
                if(storeToken.equals(token)) {
                    redisUtil.expireTime(userId);
                    return true;
                }
                printContent(response,"登录失败");
                return false;
            }catch (Exception e) {
                response.setHeader("Access-Control-Allow-Origin","*");
                response.setHeader("Access-Control-Allow-Headers","content-type");
                response.setHeader("Access-Control-Allow-Credentials","true");
                response.setContentType("application/json; charset=utf-8");
                response.setCharacterEncoding("utf-8");
                PrintWriter write = response.getWriter();
                write.write("403");
                return false;
            }
        }
        return true;
    }

    private static void printContent(HttpServletResponse response, String content) {
        try {
            response.reset();
            response.setContentType("application/json");
            response.setHeader("Cache-Control", "no-store");
            response.setCharacterEncoding("UTF-8");
            PrintWriter pw = response.getWriter();
            pw.write(content);
            pw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
