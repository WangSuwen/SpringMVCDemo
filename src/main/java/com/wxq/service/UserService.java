package com.wxq.service;

import com.wxq.entity.User;

public interface UserService {
    // 根据ID 获取用户
    User getUserById(int id);
    // 改名字
    void changeUserName (int id, String newName);
}
