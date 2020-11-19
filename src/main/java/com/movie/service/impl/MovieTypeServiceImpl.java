package com.movie.service.impl;

import com.movie.mapper.MovieTypeMapper;
import com.movie.pojo.MovieType;
import com.movie.service.MovieTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: movie-booking
 * @author: ktp
 * @create: 2020-11-19 20:48
 */

@Service
public class MovieTypeServiceImpl implements MovieTypeService {

    @Autowired
    private MovieTypeMapper movieTypeMapper;

    private Map<String, Object> map = new HashMap<>();

    @Override
    public List<MovieType> findMovieType() {
        return movieTypeMapper.findMovieType();
    }
}
