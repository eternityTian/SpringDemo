package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;
    private String username;
    private String password;
    private int sex;
    private String phone_num;
    private String email;
    private Date birth;
    private String introduction;
    private String location;
    private String avator;
    private Date create_time;
    private Date update_time;

}
