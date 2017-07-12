package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * Created by Administrator on 2017/7/8 0008.
 */
@Controller
public class UserController {

    @RequestMapping("login.do")
    @ResponseBody
    public String login(){
        return "success";
    }
}
