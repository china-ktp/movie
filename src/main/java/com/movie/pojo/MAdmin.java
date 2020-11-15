package com.movie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @program: movie-booking
 * @author: ktp
 * @create: 2020-11-15 17:54
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MAdmin {

    private Integer id;
    private String name;
    private String pass;
}
