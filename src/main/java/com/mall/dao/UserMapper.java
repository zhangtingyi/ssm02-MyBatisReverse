package com.mall.dao;


import com.mall.pojo.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}
