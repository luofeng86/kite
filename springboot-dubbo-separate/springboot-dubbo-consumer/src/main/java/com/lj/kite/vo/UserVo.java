package com.lj.kite.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liujianhj
 * @date 2018/6/15 16:10
 * @description
 */
@Data
public class UserVo implements Serializable{

    private Long id;

    private String username;

    private String password;

    private Integer age;

    private Integer gender;
}
