package cn.mybatis.service;

import cn.mybatis.entity.User;
import cn.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public User selectByName(String name) {
        System.out.println("-------------------------->执行");
        return userMapper.selectByName(name);
    }

    public User selectByAddress(String address) {
        return userMapper.selectAllByAddress(address);
    }

    public int insert(User user){
        return userMapper.insert(user);
    }
}
