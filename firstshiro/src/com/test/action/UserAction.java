package com.test.action;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/7/8 0008.
 */
@WebServlet("/shiro.do")
public class UserAction extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username= req.getParameter("username");
        String pass=req.getParameter("pass");
    try {
        UsernamePasswordToken token = new UsernamePasswordToken(username, pass);
        Subject user = SecurityUtils.getSubject();
        user.login(token);
        resp.sendRedirect("admin/main.jsp");
    }catch (AuthenticationException e){
        resp.sendRedirect("index.jsp");
    }

    }
}
