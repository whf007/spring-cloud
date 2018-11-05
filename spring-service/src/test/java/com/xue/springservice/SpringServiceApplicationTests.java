package com.xue.springservice;


import com.xue.springservice.dao.mapper.UserMapper;
import com.xue.springservice.dao.mapper.UserMapperXml;
import com.xue.springservice.dao.model.UserEntity;
import com.xue.springservice.dao.model.UserSexEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringServiceApplicationTests {

    @Test
    public void contextLoads() {
    }

//    @Autowired
//    private UserMapper userMapper;
    @Autowired
    private UserMapperXml userMapper;
    @Test
    public void testInsert() throws Exception {
        userMapper.insert(new UserEntity("aa", "a123456", UserSexEnum.MAN));
        userMapper.insert(new UserEntity("bb", "b123456", UserSexEnum.WOMAN));
        userMapper.insert(new UserEntity("cc", "b123456", UserSexEnum.WOMAN));
        List<UserEntity> all = userMapper.getAll();
        System.out.println(all.size());
    }

    @Test
    public void testQuery() throws Exception {
        List<UserEntity> users = userMapper.getAll();
        System.out.println(users.toString());
    }

    @Test
    public void testUpdate() throws Exception {
        UserEntity user = userMapper.getOne(3l);
        System.out.println(user.toString());
        user.setNickName("neo");
        userMapper.update(user);
        Assert.assertTrue(("neo".equals(userMapper.getOne(3l).getNickName())));
    }

}
