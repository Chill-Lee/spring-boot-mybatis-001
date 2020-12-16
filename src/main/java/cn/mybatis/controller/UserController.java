package cn.mybatis.controller;

import cn.hutool.json.JSONUtil;
import cn.mybatis.entity.User;
import cn.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getUser/{id}")
    public User selectByPrimaryKey(@PathVariable Integer id) {
        return userService.selectByPrimaryKey(id);
    }

    @RequestMapping("/getUserByName/{name}")
    public User selectByName(@PathVariable String name) {
        return userService.selectByName(name);
    }

    @RequestMapping("/getUserByAddress/{address}")
    public User selectByAddress(@PathVariable String address) {
        return userService.selectByAddress(address);
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ResponseBody
    public Object insert(@RequestBody String data) {
        User user = JSONUtil.toBean(data, User.class);
        System.out.println("+++++++++++++++++++++++++++++>"+user.getAddress());
        return userService.insert(user);
    }
}
