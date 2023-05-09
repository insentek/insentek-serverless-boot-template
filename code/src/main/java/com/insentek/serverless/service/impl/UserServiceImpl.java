package com.insentek.serverless.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.insentek.serverless.mapper.UserMapper;
import com.insentek.serverless.model.User;
import com.insentek.serverless.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: hao.ding@insentek.com
 * @Date: 2023/5/9 14:44
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
