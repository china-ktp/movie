package com.movie.service;

import com.movie.pojo.MAdmin;

import java.util.Map;

public interface MAdminService {

    Map<String, Object> adminLogin(MAdmin mAdmin);
}
