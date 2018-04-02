package com.demo.dao;

import com.demo.entity.URolePermission;

public interface URolePermissionMapper {
    int insert(URolePermission record);

    int insertSelective(URolePermission record);
}