package com.lj.kite.mapper;

import com.lj.kite.entity.User;

/**
 * @author liujian
 * @date 2018/5/8 23:27
 * @description
 * @since
 */
public interface UserMapper {

    User findUser(Long id);
}
