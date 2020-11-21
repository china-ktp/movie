package com.movie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.movie.mapper")
public class MovieBookingApplication {

    public static void main(String[] args) {

        SpringApplication.run(MovieBookingApplication.class, args);
    }

}
