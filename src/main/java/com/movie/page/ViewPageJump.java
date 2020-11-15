package com.movie.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: movie-booking
 * @author: ktp
 * @create: 2020-11-14 17:53
 */

/**
 * 控制展示层页面跳转
 */
@Controller
public class ViewPageJump {

    /**
     * 进入前台首页
     */
    @RequestMapping("/main.v")
    public String goViewMain(){
        return "view/v-main";
    }
}
