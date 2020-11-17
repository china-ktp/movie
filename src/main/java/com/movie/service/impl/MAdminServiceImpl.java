package com.movie.service.impl;

import com.movie.mapper.MAdminMapper;
import com.movie.pojo.MAdmin;
import com.movie.service.MAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
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

    /**
     * 查询管理员列表
     *
     * @return
     */
    @Override
    public List<MAdmin> mAdminList() {
        return mAdminMapper.mAdminList();
    }

    /**
     * 添加管理员信息
     *
     * @param mAdmin
     * @return
     */
    @Override
    public Map<String, Object> saveMAdmin(MAdmin mAdmin) {
        Integer saveMAdmin = mAdminMapper.saveMAdmin(mAdmin);
        if (saveMAdmin > 0) {
            map.put("flag", saveMAdmin);
        }
        return map;
    }

    /**
     * 修改管理员信息
     *
     * @param mAdmin
     * @return
     */
    @Override
    public Map<String, Object> editMAdmin(MAdmin mAdmin) {
        Integer editMAdmin = mAdminMapper.editMAdmin(mAdmin);
        if (editMAdmin > 0) {
            map.put("flag", editMAdmin);
        }
        return map;
    }

    /**
     * 根据id删除一条管理员信息
     *
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> delMAdminById(Integer id) {
        Integer delMAdminById = mAdminMapper.delMAdminById(id);
        if (delMAdminById > 0) {
            map.put("flag", delMAdminById);
        }
        return map;
    }

    /**
     * 根据账号模糊查询
     *
     * @param name
     * @return
     */
    @Override
    public List<MAdmin> findMAdminByName(String name) {
        return mAdminMapper.findMAdminByName(name);
    }

}
