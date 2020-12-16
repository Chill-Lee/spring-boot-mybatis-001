package cn.mybatis.controller;

import cn.mybatis.entity.Account;
import cn.mybatis.mapper.AccountMapper;
import cn.mybatis.mapper.UserMapper;
import cn.mybatis.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @Autowired
    AccountMapper accountMapper;

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/transferAccounts",method = RequestMethod.POST)
    @ResponseBody
    public void transferAccounts(@RequestParam int fromUserId,@RequestParam int toUserId,@RequestParam float account){
        System.out.println("传入的参数分别是==>fromUserId:"+fromUserId+"   toUserId:"+toUserId+"   account:"+account);
        try {
            accountService.transferAccounts(fromUserId,toUserId,account);
        }catch(Exception e){
            Account i = accountMapper.selectByPrimaryKey(fromUserId);
            System.out.println(i.toString());
        }
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public Account selectById(@RequestParam int id) throws InterruptedException {
        Account account = accountService.selectById(id);
        return account;
    }
}
