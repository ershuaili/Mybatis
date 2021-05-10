package com.example.pojo;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.impl.MybatisImpl;
import junit.framework.TestCase;
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

    @Test
    public void test() {

        //获得SqlSession对象
        SqlSession sqlSession = MybatisImpl.getSqlSession();

        try {
            //执行SQL
            //方式一 推荐
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserList();

            //方式二 了解
//            List<User> userList = sqlSession.selectList("com.glp.dao.UserMapper.getUserList");

            for (User user : userList) {
                System.out.println(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭sqlSession
            sqlSession.close();
        }
    }


}