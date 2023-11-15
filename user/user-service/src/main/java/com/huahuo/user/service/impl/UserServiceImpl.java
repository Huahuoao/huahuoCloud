package com.huahuo.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huahuo.user.mapper.UserMapper;
import com.huahuo.user.pojo.User;
import com.huahuo.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author 陈建辉
 * @description 针对表【cloud_user】的数据库操作Service实现
 * @createDate 2023-11-15 09:39:53
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

}




