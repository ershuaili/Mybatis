package com.example.mapper;

import com.example.entity.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/06 下午 4:23
 */
public interface UserMapper {
    /**
     * 添加一个用户
     * @param user 用户
     * @return int
     */
    int addUser(User user);

    /**
     * 删除一个用户
     * @param id 用户id
     * @return int
     */
    int deleteUser(int id);

    /**
     * 更改一个用户
     * @param user 用户
     * @return int
     */
    int updateUser(User user);

    /**
     * 获取用户集合
     * @return List
     */
    List<User> getUserList();

    /**
     * 根据用户id查询用户
     *  @param id 用户id
     * @return user
     */
    User getUserById(int id);

}
