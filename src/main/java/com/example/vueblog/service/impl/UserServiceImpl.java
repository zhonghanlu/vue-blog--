package com.example.vueblog.service.impl;

import com.example.vueblog.entity.User;
import com.example.vueblog.mapper.UserMapper;
import com.example.vueblog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhonghanluu@gamil.com
 * @since 2023-04-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
