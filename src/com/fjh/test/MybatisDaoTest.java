package com.fjh.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fjh.dao.UserDao;
import com.fjh.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉 junit，Spring 配置文件路径
@ContextConfiguration({"classpath:config/springmybatis.xml"})
public class MybatisDaoTest {
	
//  注入Dao实现类
    @Resource
    private UserDao userDao;
    
    @Test
    public void reduceNumber() throws Exception {
    	int id = 1;
        User user = userDao.getUserById(id);
        System.out.println(user);
        System.out.println(user.getUser_name());
        System.out.println(user.getId());

    }
	
}
