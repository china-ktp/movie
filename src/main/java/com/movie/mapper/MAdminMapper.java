package com.movie.mapper;

import com.movie.pojo.MAdmin;

import java.util.List;

public interface MAdminMapper {

    MAdmin adminLogin(MAdmin mAdmin);

    List<MAdmin> mAdminList();

    Integer saveMAdmin(MAdmin mAdmin);

    Integer editMAdmin(MAdmin mAdmin);

    Integer delMAdminById(Integer id);

}
