package com.mall.dao;

import com.mall.pojo.Car;

public interface CarMapper {
    int insert(Car record);

    int insertSelective(Car record);
}
