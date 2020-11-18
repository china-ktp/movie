package com.movie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @program: movie-booking
 * @author: ktp
 * @create: 2020-11-18 16:29
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class VUser {

    private Integer id;
    private String phone;
    private String pass;
    private String email;
    private String address;
    private Integer sex;
    private String name;
}
