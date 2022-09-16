package com.captain.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.captain.beans.entity.User;
import com.captain.serivice.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @auth sailor
 * @date 2022/4/23 17:31
 * @desc LoginController
 */
@Controller
@AllArgsConstructor
public class LoginController {

    private final UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login() {
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "doLogin", method = RequestMethod.GET)
    public String doLogin(String name, String password) {
        User user = userService.isUser(name, password);
        if(user != null) {
            StpUtil.login(user.getId());
            return "登录成功";
        }
        return "登录失败";
    }

    @ResponseBody
    @RequestMapping("isLogin")
    public Boolean isLogin() {
        return StpUtil.isLogin();
    }

    @ResponseBody
    @RequestMapping("logout")
    public void logout() {
        StpUtil.logout();
    }

}
