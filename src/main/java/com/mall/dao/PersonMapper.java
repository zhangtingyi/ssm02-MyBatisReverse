package com.mall.dao;

import com.mall.pojo.Person;

public interface PersonMapper {
    int insert(Person record);

    int insertSelective(Person record);
}
