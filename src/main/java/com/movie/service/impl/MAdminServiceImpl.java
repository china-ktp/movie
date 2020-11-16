package com.movie.service.impl;

import com.movie.mapper.MAdminMapper;
import com.movie.pojo.MAdmin;
import com.movie.service.MAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: movie-booking
 * @author: ktp
 * @create: 2020-11-15 20:41
 */

@Service
public class MAdminServiceImpl implements MAdminService {

    @Autowired
    private MAdminMapper mAdminMapper;

    private Map<String, Object> map = new HashMap<>();

    /**
     * 电影售票管理后台管理员登录
     *
     * @param mAdmin
     * @return
     */
    @Override
    public Map<String, Object> adminLogin(MAdmin mAdmin) {
        MAdmin obj = mAdminMapper.adminLogin(mAdmin);
        if (obj != null) {
            map.put("flag", obj);
        }
        return map;
    }
}
