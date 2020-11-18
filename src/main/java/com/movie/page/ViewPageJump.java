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
    public String goViewMain() {
        return "view/v-main";
    }

    /**
     * 进入登录页面
     */
    @RequestMapping("/goViewLogin.v")
    public String goViewLogin() {
        return "view/v-login";
    }

    /**
     * 进入首页明星专访区
     */
    @RequestMapping("/goViewVideo.v")
    public String goViewVideo() {
        return "view/v-video";
    }

    /**
     * 进入首页时讯
     */
    @RequestMapping("/goViewIdeai.v")
    public String goViewIdeai() {
        return "view/v-idea";
    }

    /**
     * 进入首页电影分类
     */
    @RequestMapping("/goViewVideoList.v")
    public String goViewVideoList() {
        return "view/v-videolist";
    }

    /**
     * 进入首页购物专栏
     */
    @RequestMapping("/goViewshop.v")
    public String goViewshop() {
        return "view/v-shop";
    }

    /**
     * 进入首页我的小世界
     */
    @RequestMapping("/goViewhom.v")
    public String goViewhom() {
        return "view/v-hom";
    }
    /**
     * 进入首页我的小世界/用户设置
     */
    @RequestMapping("/goViewset.v")
    public String goViewset() {
        return "view/v-mon";
    }
    /**
     * 进入首页我的小世界/我的消息
     */
    @RequestMapping("/goViewmessge.v")
    public String goViewmessge() {
        return "view/v-messge";
    }

}
