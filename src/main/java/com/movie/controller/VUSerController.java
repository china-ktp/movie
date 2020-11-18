package com.movie.controller;

import com.movie.pojo.VUser;
import com.movie.service.VUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/findVUser.v")
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

    @PostMapping("/saveVUser.v")
    @ResponseBody
    public Map<String, Object> saveVUser(VUser vUser) {
        return vUserService.saveVUser(vUser);
    }

    @PutMapping("/editVUser.v")
    @ResponseBody
    public Map<String, Object> editVUser(VUser vUser) {
        return vUserService.editVUser(vUser);
    }

    @DeleteMapping("/delVUserById.v")
    @ResponseBody
    public Map<String, Object> delVUserById(Integer id) {
        return vUserService.delVUserById(id);
    }
}
