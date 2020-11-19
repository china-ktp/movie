package com.movie.pojo;

import lombok.ToString;

/**
 * @program: movie-booking
 * @author: ktp
 * @create: 2020-11-18 16:29
 */

@ToString
public class VUser {

    private Integer id;
    private String phone;
    private String pass;
    private String email;
    private String address;
    private Integer sex;
    private String vname;

    public VUser() {
    }

    public VUser(Integer id, String phone, String pass, String email, String address, Integer sex, String vname) {
        this.id = id;
        this.phone = phone;
        this.pass = pass;
        this.email = email;
        this.address = address;
        this.sex = sex;
        this.vname = vname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }
}
