package com.xue.springservice.dao.mapper;
/**
 * Created by Administrator on 2018/11/5.
 */

import com.xue.springservice.dao.model.UserEntity;
import com.xue.springservice.dao.model.UserSexEnum;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: spring-cloud
 * @description:
 * @author: whf
 * @create: on 2018/11/5.
 **/
@Component
@Mapper
public interface  UserMapper {
    @Select("SELECT * FROM users")
    @Results({@Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class), @Result(property = "nickName", column = "nick_name")})
    List<UserEntity> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    @Results({@Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class), @Result(property = "nickName", column = "nick_name")})
    UserEntity getOne(Long id);

    @Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
    void insert(UserEntity user);

    @Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(UserEntity user);

    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);
}
