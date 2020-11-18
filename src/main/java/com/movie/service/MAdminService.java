package com.movie.service;

import com.movie.pojo.MAdmin;

import java.util.List;
import java.util.Map;

public interface MAdminService {

    Map<String, Object> adminLogin(MAdmin mAdmin);

    List<MAdmin> mAdminList();

    Map<String, Object> saveMAdmin(MAdmin mAdmin);

    Map<String, Object> editMAdmin(MAdmin mAdmin);

    Map<String, Object> delMAdminById(Integer id);

}
