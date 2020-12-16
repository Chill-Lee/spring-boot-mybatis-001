package cn.mybatis.mapper;

import cn.mybatis.entity.City;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CityMapperTest {
    @Autowired
    CityMapper cityMapper;

    @Test
    void findByState() {
        City ca = cityMapper.findByState("CA");
        System.out.println(ca);
    }
}