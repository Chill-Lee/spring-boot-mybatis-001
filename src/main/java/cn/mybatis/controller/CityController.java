package cn.mybatis.controller;

import cn.mybatis.entity.City;
import cn.mybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    @Autowired
    CityService cityService;

    @RequestMapping("/getCity/{state}")
    public City findByState(@PathVariable String state){
        return cityService.findByState(state);
    }

    @RequestMapping("/getCity1/{state}")
    public City findByState1(@PathVariable String state){
        return cityService.findByState(state);
    }
}
