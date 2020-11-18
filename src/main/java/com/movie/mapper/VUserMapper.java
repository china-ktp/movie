package com.movie.mapper;

import com.movie.pojo.VUser;

import java.util.List;

public interface VUserMapper {

    List<VUser> findVUser();

    Integer saveVUser(VUser vUser);

    Integer editVUser(VUser vUser);

    Integer delVUserById(Integer id);
}
