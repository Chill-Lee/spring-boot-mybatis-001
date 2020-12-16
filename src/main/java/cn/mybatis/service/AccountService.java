package cn.mybatis.service;

import cn.hutool.core.lang.Console;
import cn.mybatis.entity.Account;
import cn.mybatis.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;

    @Transactional
    public void transferAccounts(int fromUserId, int toUserId, float account){
        Account fromAccount = accountMapper.selectByPrimaryKey(fromUserId);
        Console.log("转账前的from账户为"+fromAccount.toString());
        float fromBalance = fromAccount.getBalance();
        float v = fromBalance - account;
        fromAccount.setBalance(v);
        System.out.println("转账前的from账户为"+fromAccount.toString());
        int i = accountMapper.updateByPrimaryKey(fromAccount);
        System.out.println("from===============================>"+i);
        //扣钱
        Account toAccount = accountMapper.selectByPrimaryKey(toUserId);
        Console.log("转账前的to账户为"+toAccount.toString());
        float toBalance = toAccount.getBalance();
        float n = toBalance + account;
        toAccount.setBalance(n);
        System.out.println("转账后的to账户为"+toAccount.toString());
        int a = 1/0;
        int y = accountMapper.updateByPrimaryKey(toAccount);
        System.out.println("to===============================>"+y);
    }

    @Transactional
    public Account selectById(int id) throws InterruptedException {
        Account account = accountMapper.selectById(id);
        Console.log("==============================>>下一个sql日志");
        Thread.sleep(5000);
        accountMapper.selectById(id);
        return account;
    }
}
