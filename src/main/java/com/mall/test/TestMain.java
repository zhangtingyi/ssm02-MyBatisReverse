package com.mall.test;

import com.mall.pojo.Car;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.io.IOException;

public class TestMain {
    public static void main(String[] args) throws IOException {
        InputStream inputStream =new Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession=sqlSessionFactory.openSession();

//        sqlSession.selectOne();
        Car car=new Car(100,"mybatis");
        sqlSession.insert("com.mall.dao.CarMapper.insert",car);
        sqlSession.commit();
        sqlSession.close();

    }

}
