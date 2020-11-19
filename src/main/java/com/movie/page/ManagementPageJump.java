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
    public String goManagementLogin() {
        return "management/m-login";
    }

    /**
     * 登录成功进入后台管理首页
     */
    @RequestMapping("/goMain.m")
    public String goMain() {
        return "management/m-main";
    }

    /**
     * 默认展示系统首页
     */
    @RequestMapping("/homePage.m")
    public String homePage() {
        return "management/m-home-page";
    }

    /**
     * 管理员列表
     */
    @RequestMapping("/adminList.m")
    public String adminList() {
        return "management/admin/m-admin-list";
    }

    /**
     * 进入管理员添加页面
     */
    @RequestMapping("/adminSave.m")
    public String adminSave() {
        return "management/admin/m-admin-save";
    }

    /**
     * 进入管理员修改页面
     */
    @RequestMapping("/adminEdit.m")
    public String adminEdit() {
        return "management/admin/m-admin-edit";
    }

    /**
     * 进入用户列表
     */
    @RequestMapping("/findVUser.m")
    public String findVUser() {
        return "management/user/m-user-list";
    }

    /**
     * 进入用户添加页面
     */
    @RequestMapping("/saveVUser.m")
    public String saveVUser() {
        return "management/user/m-user-save";
    }

    /**
     * 进入用户修改页面
     */
    @RequestMapping("/editVUser.m")
    public String editVUser() {
        return "management/user/m-user-edit";
    }

    /**
     * 进入电影分类列表
     */
    @RequestMapping("/findMovieType.m")
    public String findMovieType() {
        return "management/movieType/m-movie-type-list";
    }

    /**
     * 进入电影分类添加页面
     */
    @RequestMapping("/saveMovieType.m")
    public String saveMovieType() {
        return "management/movieType/m-movie-type-save";
    }

    /**
     * 进入电影分类编辑页面
     */
    @RequestMapping("/editMovieType.m")
    public String editMovieType() {
        return "management/movieType/m-movie-type-edit";
    }
}
