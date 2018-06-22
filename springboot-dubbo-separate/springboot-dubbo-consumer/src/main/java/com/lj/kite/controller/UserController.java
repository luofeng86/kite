package com.lj.kite.controller;

import com.lj.kite.dto.UserDto;
import com.lj.kite.service.UserService;
import com.lj.kite.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liujian
 * @date 2018/6/15 15:40
 * @description
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findUser/{userId}")
    @ResponseBody
    public UserVo findUser(@PathVariable Long userId) {
        UserVo vo = new UserVo();
        UserDto dto = userService.findUser(userId);
        if (dto != null) {
            BeanUtils.copyProperties(dto, vo);
        }
        return vo;
    }
}
