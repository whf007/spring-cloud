package com.xue.springservice.dao.mapper;

import com.xue.springservice.dao.model.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2018/11/5.
 */
@Component
@Mapper
public interface UserMapperXml {
        List<UserEntity> getAll();
        UserEntity getOne(Long id);
        void insert(UserEntity user);
        void update(UserEntity user);
        void delete(Long id);

}
