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
    @RequestMapping("/findVUser.v")
    public String findVUser() {
        return "management/user/m-user-list";
    }

    /**
     * 进入用户添加页面
     */
    @RequestMapping("/saveVUser.v")
    public String saveVUser() {
        return "management/user/m-user-save";
    }

    /**
     * 进入用户修改页面
     */
    @RequestMapping("/editVUser.v")
    public String editVUser() {
        return "management/user/m-user-edit";
    }
}
