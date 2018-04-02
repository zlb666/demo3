package com.demo.dao;

import com.demo.entity.URole;

import java.util.List;

public interface URoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(URole record);

    int insertSelective(URole record);

    URole selectByPrimaryKey(Long id);

    List<URole> findRoleByUid (Long uid);

    int updateByPrimaryKeySelective(URole record);

    int updateByPrimaryKey(URole record);
}