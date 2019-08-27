package com.wxq.dao;

import com.wxq.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    // 根据ID 获取用户
    User getUserById(int userId);
    // 改名字
    void changeUserName (@Param("userId") int userId, @Param("newName") String newName);
}
