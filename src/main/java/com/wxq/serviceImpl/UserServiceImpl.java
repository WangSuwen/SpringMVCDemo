package com.wxq.serviceImpl;

import com.wxq.dao.UserDao;
import com.wxq.entity.User;
import com.wxq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById (int id) {
        return userDao.getUserById(id);
    }

    @Override
    public void changeUserName (int id, String newName) {
        userDao.changeUserName(id, newName);
    }
}
