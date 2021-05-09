package com.example.mapper;

import com.example.pojo.User;
import com.example.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/03 下午 3:46
 */
public class UserDaoTest {

    @Test
    public void test() {

        //获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
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

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        /*获取mapper*/
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //生成对象
        User user = mapper.getUserById(2);
        System.out.println(user);

        sqlSession.close();
    }
}
