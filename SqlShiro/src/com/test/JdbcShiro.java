package com.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;

/**
 * Created by Administrator on 2017/7/10 0010.
 */
public class JdbcShiro {
    //登录判断
    public static void login(){
        try {
            IniSecurityManagerFactory factory= new IniSecurityManagerFactory("classpath:shiro.ini");
            SecurityManager manager= factory.getInstance();
            SecurityUtils.setSecurityManager(manager);
            Subject user= SecurityUtils.getSubject();
            //令牌
            UsernamePasswordToken token= new UsernamePasswordToken("aa","aa");
            user.login(token);
            Boolean issuccess= user.isAuthenticated();
            System.out.println("是否登录成功："+issuccess);
           boolean isrole= user.hasRole("经理");
            System.out.println("是否是经理："+isrole);
        }catch (IncorrectCredentialsException ie){
            System.out.println("账号*密码*错误!");
            ie.printStackTrace();
        }
        catch (UnknownAccountException UE){
            System.out.println("账号*密码错误!");
            UE.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        login();
    }
}
