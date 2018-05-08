package com.lj.kite.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liujian
 * @date 2018/5/8 23:10
 * @description 用户Dto对象
 * @since 1.0
 */
@Data
public class UserDto implements Serializable{

    private Long id;

    private String username;

    private String password;

    private Integer age;

    private Integer gender;

}
