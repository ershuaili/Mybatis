package com.example.mapper;

import com.example.pojo.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/03 上午 11:54
 */
public interface UserMapper {
    /**
     * 查询全部用户
     * @return user
     */
    List<User> getUserList();

    /**
     * 查询一个用户
     * @param id
     * @return user
     */
    User getUserById(int id);
}
