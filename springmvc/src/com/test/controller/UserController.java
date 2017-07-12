package com.test.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/7/10 0010.
 */
@Controller
public class UserController {
    @RequestMapping("login.do")
    public String login(String account,String pass){
        try {
            Subject user= SecurityUtils.getSubject();
            UsernamePasswordToken token=new UsernamePasswordToken(account,pass);
            user.login(token);
            boolean issuccess= user.isAuthenticated();
            System.out.println("是否登录成功："+issuccess);
            return "success";
        } catch (AuthenticationException e) {
            System.out.println("账号密码错误");
            e.printStackTrace();
            return "index";
        }
    }
    @RequestMapping("noqx.do")
    public  String noqx(){
        return "noqx";
    }
}
