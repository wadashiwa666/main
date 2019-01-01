package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.vo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    int getMaxId(@Param("table") String table);
    
    List<User> getAllUsers();
}