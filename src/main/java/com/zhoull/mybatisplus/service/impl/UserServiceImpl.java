package com.zhoull.mybatisplus.service.impl;

import com.zhoull.mybatisplus.entity.User;
import com.zhoull.mybatisplus.mapper.UserMapper;
import com.zhoull.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author charlie
 * @since 2019-09-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
