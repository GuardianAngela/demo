package com.qf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.mapper.UserMapper;
import com.qf.model.User;
import com.qf.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Description: UserServiceImpl
 * @Author: GuardianAngel
 * @Date: 2022/5/26
 * @Version: 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
