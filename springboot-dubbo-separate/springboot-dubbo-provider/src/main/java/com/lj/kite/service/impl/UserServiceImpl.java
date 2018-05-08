package com.lj.kite.service.impl;

import com.lj.kite.dto.UserDto;
import com.lj.kite.entity.User;
import com.lj.kite.mapper.UserMapper;
import com.lj.kite.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liujian
 * @date 2018/5/8 23:25
 * @description 用户服务实现类
 * @since 1.0
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto findUser(Long id) {
        User user = userMapper.findUser(id);
        UserDto dto = new UserDto();
        BeanUtils.copyProperties(user, dto);
        return dto;
    }
}
