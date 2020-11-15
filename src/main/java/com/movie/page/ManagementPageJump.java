package com.movie.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: movie-booking
 * @author: ktp
 * @create: 2020-11-14 17:56
 */

/**
 * 控制后台管理页面跳转
 */
@Controller
public class ManagementPageJump {

    /**
     * 进入后台管理系统
     */
    @RequestMapping("/login.m")
    public String goManagementLogin(){
        return "management/m-login";
    }
}
