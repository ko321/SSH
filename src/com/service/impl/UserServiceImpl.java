package com.service.impl;
import com.entity.User;
import com.dao.UserDao;
import com.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 〈〉
 *
 * @author Administrator
 * @create 2018/5/10
 * @since 1.0.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name="userDao")
    private UserDao userDao;
    public UserDao getUserDao() {
        return userDao;
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public boolean login(User user) {
        return this.userDao.login(user);
    }
}