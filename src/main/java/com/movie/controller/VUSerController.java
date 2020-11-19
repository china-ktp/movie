package com.movie.controller;

import com.movie.pojo.VUser;
import com.movie.service.VUserService;
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
 * @create: 2020-11-18 16:31
 */

@Controller
@RequestMapping("/vuser")
public class VUSerController {

    @Autowired
    private VUserService vUserService;

    private Map<String, Object> map = new HashMap<>();

    @GetMapping("/vUserLogin.m")
    @ResponseBody
    public VUser vUserLogin(VUser vUser, HttpServletRequest request) {
        VUser vUserLogin = vUserService.vUserLogin(vUser);
        if (vUserLogin != null) {
            request.getSession().setAttribute("vuser", vUserLogin);
            request.getSession().setAttribute("vname", vUserLogin.getVname());
        }
        return vUserLogin;
    }

    @RequestMapping("/signOut.m")
    @ResponseBody
    public Map<String, Object> signOut(HttpSession session) {
        session.removeAttribute("vuser");
        session.removeAttribute("vname");
        map.put("signOut", "signOut");
        return map;
    }

    @GetMapping("/findVUser.m")
    @ResponseBody
    public Map<String, Object> findVUser() {
        List<VUser> vUser = vUserService.findVUser();
        if (vUser != null) {
            map.put("code", 0);
            map.put("msg", "");
            map.put("count", vUser.size());
            map.put("data", vUser);
        }
        return map;
    }

    @PostMapping("/saveVUser.m")
    @ResponseBody
    public Map<String, Object> saveVUser(VUser vUser, HttpServletRequest request) {
        String phone = null;
        Map<String, Object> saveVUser = null;
        vUser.setVname("user");
        String pagePhone = request.getParameter("phone");
        List<VUser> user = vUserService.findVUser();
        for (VUser vUser1 : user) {
            phone = vUser1.getPhone();
        }
        if (!pagePhone.equals(phone)) {
            saveVUser = vUserService.saveVUser(vUser);
        }else {
            try {
                throw new Exception("手机号已经存在");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return saveVUser;
    }

    @PutMapping("/editVUser.m")
    @ResponseBody
    public Map<String, Object> editVUser(VUser vUser) {
        return vUserService.editVUser(vUser);
    }

    @DeleteMapping("/delVUserById.m")
    @ResponseBody
    public Map<String, Object> delVUserById(Integer id) {
        return vUserService.delVUserById(id);
    }
}
