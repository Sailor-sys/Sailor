package com.captain.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.captain.beans.entity.User;
import com.captain.serivice.UserService;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auth sailor
 * @date 2022/4/23 17:31
 * @desc LoginController
 */
@RestController
@AllArgsConstructor
public class LoginController {

    private UserService userService;

    @RequestMapping("doLogin")
    public String doLogin(String name, String password) {
        User user = userService.isUser(name, password);
        if(user != null) {
            StpUtil.login(user.getId());
            return "登录成功";
        }
        return "登录失败";
    }

    @RequestMapping("isLogin")
    public Boolean isLogin() {
        return StpUtil.isLogin();
    }

    @RequestMapping("logout")
    public void logout() {
        StpUtil.logout();
    }

}
