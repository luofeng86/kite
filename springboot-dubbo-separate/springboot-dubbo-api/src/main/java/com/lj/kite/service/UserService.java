package com.lj.kite.service;

import com.lj.kite.dto.UserDto;

/**
 * @author liujian
 * @date 2018/5/8 23:14
 * @description 用户服务接口
 * @since 1.0
 */
public interface UserService {

    UserDto findUser(Long id);
}
