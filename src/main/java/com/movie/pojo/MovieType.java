package com.movie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @program: movie-booking
 * @author: ktp
 * @create: 2020-11-19 20:46
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MovieType {

    private Integer id;
    private String vname;
}
