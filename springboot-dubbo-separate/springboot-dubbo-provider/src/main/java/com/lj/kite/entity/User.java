package com.lj.kite.entity;

import lombok.Data;

/**
 * @author liujian
 * @date 2018/5/8 23:29
 * @description 用户实体类
 * @since 1.0
 */
@Data
public class User {

    private Long id;

    private String username;

    private String password;

    private Integer age;

    private Integer gender;
}
