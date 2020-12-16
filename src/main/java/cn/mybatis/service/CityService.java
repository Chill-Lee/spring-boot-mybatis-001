package cn.mybatis.service;

import cn.mybatis.entity.City;
import cn.mybatis.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    CityMapper cityMapper;

    public City findByState(String state){
        return cityMapper.findByState(state);
    }

}
