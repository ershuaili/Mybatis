package com.explorer.dao;

import com.explorer.pojo.User;
import com.explorer.utils.MybatisUtils;
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
    public void test(){
        //获取SQLSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //方法一：getMapper
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }
        //关闭
        sqlSession.close();
    }
}
