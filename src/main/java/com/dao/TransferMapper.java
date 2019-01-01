package com.dao;

import org.apache.ibatis.annotations.Param;

import com.vo.Transfer;

public interface TransferMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Transfer record);

    int insertSelective(Transfer record);

    Transfer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Transfer record);

    int updateByPrimaryKey(Transfer record);
    
    Integer getMaxId();
    
    int transfer(@Param("name") String name,@Param("amount") int amount);
    
    int addtransfer(@Param("name") String name,@Param("amount") int amount);
}