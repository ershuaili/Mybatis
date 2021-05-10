package com.example.pojo;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.impl.MybatisImpl;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/05 下午 11:23
 */
public class UserTest {
    //    查寻全部用户
    @Test
    public void testSelectUser() {
        //获得SqlSession对象
        SqlSession session = MybatisImpl.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.getUserList();
        System.out.println(users);
        //关闭sqlSession
        session.close();
    }

    //    根据Id查询用户
    @Test
    public void selectUserById() {
        SqlSession session = MybatisImpl.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        session.close();
    }

    //    插入用户
    @Test
    public void insertUser() {
        SqlSession session = MybatisImpl.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        User user =new User(5,"赵六","asdf");
        int i = mapper.addUser(user);
        System.out.println(i);
        //注意提交事务
        session.commit();
        session.close();
    }

//    删除一个用户
    @Test
    public void deleteUser(){
        SqlSession session = MybatisImpl.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
//        删除用户id为4的用户
        int i = mapper.deleteUser(5);
        System.out.println(i);
//        提交事务
        session.commit();
//        关闭连接
        session.close();
    }
}