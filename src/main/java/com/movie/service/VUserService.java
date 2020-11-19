package com.movie.service;

import com.movie.pojo.VUser;

import java.util.List;
import java.util.Map;

public interface VUserService {

    VUser vUserLogin(VUser vUser);

    List<VUser> findVUser();

    Map<String, Object> saveVUser(VUser vUser);

    Map<String, Object> editVUser(VUser vUser);

    Map<String, Object> delVUserById(Integer id);
}
