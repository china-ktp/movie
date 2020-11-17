package com.movie.controller;

import com.movie.pojo.MAdmin;
import com.movie.service.MAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: movie-booking
 * @author: ktp
 * @create: 2020-11-15 17:55
 */

@Controller
@RequestMapping("/admin")
public class MAdminController {

    @Autowired
    private MAdminService mAdminService;

    private Map<String, Object> map = new HashMap<>();

    /**
     * 电影售票管理后台管理员登录
     *
     * @param mAdmin
     * @param request
     * @return
     */
    @GetMapping("/adminLogin-m")
    @ResponseBody
    public Map<String, Object> adminLogin(MAdmin mAdmin,
                                          HttpServletRequest request) {
        Map<String, Object> admin = mAdminService.adminLogin(mAdmin);
        if (admin != null) {
            request.getSession().setAttribute("MAdmin", admin);
            request.getSession().setAttribute("mname", mAdmin.getMname());
        }
        return admin;
    }

    /**
     * 管理员退出登录
     *
     * @param session
     * @return
     */
    @RequestMapping("/signOut.m")
    @ResponseBody
    public Map<String, Object> signOut(HttpSession session) {
        session.removeAttribute("map");
        map.put("signOut", "signOut");
        return map;
    }

    /**
     * 查询所有管理员列表
     *
     * @return
     */
    @GetMapping("/mAdminList.m")
    @ResponseBody
    public Map<String, Object> mAdminList() {
        List<MAdmin> mAdmins = mAdminService.mAdminList();
        if (mAdmins != null) {
            map.put("code", 0);
            map.put("msg", "");
            map.put("count", mAdmins.size());
            map.put("data", mAdmins);
        }
        return map;
    }

    /**
     * 添加一条管理员信息
     *
     * @param mAdmin
     * @param session
     * @return
     */
    @PostMapping("/saveMAdmin.m")
    @ResponseBody
    public Map<String, Object> saveMAdmin(MAdmin mAdmin, HttpSession session) {
        Map<String, Object> saveMAdmin = mAdminService.saveMAdmin(mAdmin);
        return saveMAdmin;
    }

    /**
     * 修改管理员信息
     *
     * @param mAdmin
     * @return
     */
    @PutMapping("/editMAdmin.m")
    @ResponseBody
    public Map<String, Object> editMAdmin(MAdmin mAdmin) {
        Map<String, Object> editMAdmin = mAdminService.editMAdmin(mAdmin);
        return editMAdmin;
    }

    /**
     * 根据id删除一条管理员信息
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delMAdminById.m")
    @ResponseBody
    public Map<String, Object> delMAdminById(Integer id) {
        Map<String, Object> delMAdminById = mAdminService.delMAdminById(id);
        return delMAdminById;
    }

    @GetMapping("/findMAdminByName")
    @ResponseBody
    public Map<String, Object> findMAdminByName(String name) {
        List<MAdmin> findMAdminByName = mAdminService.findMAdminByName(name);
        if (findMAdminByName != null) {
            map.put("code", 0);
            map.put("msg", "");
            map.put("count", findMAdminByName.size());
            map.put("data", findMAdminByName);
        }
        return map;
    }
}
