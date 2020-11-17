package com.movie.service;

import com.movie.pojo.MAdmin;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MAdminService {

    Map<String, Object> adminLogin(MAdmin mAdmin);

    List<MAdmin> mAdminList();

    Map<String, Object> saveMAdmin(MAdmin mAdmin);

    Map<String, Object> editMAdmin(MAdmin mAdmin);

    Map<String, Object> delMAdminById(Integer id);

    List<MAdmin> findMAdminByName(@Param("mname") String name);
}
