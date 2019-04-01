package com.zh.program.Dao;

import com.zh.program.Entrty.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    int updateByPrimaryKey(User record);

    int updateByPrimaryKeySelective(User record);

    int deleteByPrimaryKey(Integer id);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll(Map<Object, Object> param);

    List<User> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}