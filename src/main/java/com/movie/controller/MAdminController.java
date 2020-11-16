package com.movie.controller;

import com.movie.pojo.MAdmin;
import com.movie.service.MAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
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
        Map<String, Object> map = mAdminService.adminLogin(mAdmin);
        if (!CollectionUtils.isEmpty(map)) {
            request.getSession().setAttribute("map", map);
        }
        return map;
    }
}
