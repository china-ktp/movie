package com.movie.mapper;

import com.movie.pojo.MAdmin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MAdminMapper {

    MAdmin adminLogin(MAdmin mAdmin);

    List<MAdmin> mAdminList();

    Integer saveMAdmin(MAdmin mAdmin);

    Integer editMAdmin(MAdmin mAdmin);

    Integer delMAdminById(Integer id);

    List<MAdmin> findMAdminByName(@Param("mname") String name);
}
