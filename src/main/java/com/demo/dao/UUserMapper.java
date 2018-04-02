package com.demo.dao;

import com.demo.entity.UUser;

public interface UUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UUser record);

    int insertSelective(UUser record);

    UUser selectByPrimaryKey(Long id);

    UUser findByName (String nickname);

    int updateByPrimaryKeySelective(UUser record);

    int updateByPrimaryKey(UUser record);
}