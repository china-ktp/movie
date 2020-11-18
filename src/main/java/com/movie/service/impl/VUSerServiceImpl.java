package com.movie.service.impl;

import com.movie.mapper.VUserMapper;
import com.movie.pojo.VUser;
import com.movie.service.VUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: movie-booking
 * @author: ktp
 * @create: 2020-11-18 16:31
 */

@Service
public class VUSerServiceImpl implements VUserService {

    @Autowired
    private VUserMapper vUserMapper;

    private Map<String, Object> map = new HashMap<>();

    @Override
    public List<VUser> findVUser() {
        return vUserMapper.findVUser();
    }

    @Override
    public Map<String, Object> saveVUser(VUser vUser) {
        Integer saveVUser = vUserMapper.saveVUser(vUser);
        if (saveVUser > 0) {
            map.put("flag", saveVUser);
        }
        return map;
    }

    @Override
    public Map<String, Object> editVUser(VUser vUser) {
        Integer editVUser = vUserMapper.editVUser(vUser);
        if (editVUser > 0) {
            map.put("flag", editVUser);
        }
        return map;
    }

    @Override
    public Map<String, Object> delVUserById(Integer id) {
        Integer delVUserById = vUserMapper.delVUserById(id);
        if (delVUserById > 0) {
            map.put("flag", delVUserById);
        }
        return map;
    }
}
