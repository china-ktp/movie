package com.movie.controller;

import com.movie.pojo.MovieType;
import com.movie.service.MovieTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: movie-booking
 * @author: ktp
 * @create: 2020-11-19 20:48
 */

@Controller
@RequestMapping("/movieType")
public class MovieTypeController {

    @Autowired
    private MovieTypeService movieTypeService;

    private Map<String, Object> map = new HashMap<>();

    @GetMapping("/findMovieType.m")
    @ResponseBody
    public Map<String, Object> findMovieType() {
        List<MovieType> movieType = movieTypeService.findMovieType();
        if (movieType != null) {
            map.put("code", 0);
            map.put("msg", "");
            map.put("count", movieType.size());
            map.put("data", movieType);
        }
        return map;
    }
}
