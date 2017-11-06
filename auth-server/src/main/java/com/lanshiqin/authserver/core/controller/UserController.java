package com.lanshiqin.authserver.core.controller;

import com.lanshiqin.authserver.core.entity.Account;
import com.lanshiqin.authserver.core.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 *  用户信息控制器
 */
@RestController
public class UserController {

    @Autowired
    private AccountRepository accountRepository;    // 账户数据操作接口


    /**
     * 初始化用户数据
     */
    @Autowired
    public void init(){

        // 为了方便测试,这里添加了两个不同角色的账户
        accountRepository.deleteAll();

        Account accountA = new Account();
        accountA.setUserName("admin");
        accountA.setPassWord("admin");
        accountA.setRoles(new String[]{"ROLE_ADMIN","ROLE_USER"});
        accountRepository.save(accountA);

        Account accountB = new Account();
        accountB.setUserName("guest");
        accountB.setPassWord("pass123");
        accountB.setRoles(new String[]{"ROLE_GUEST"});
        accountRepository.save(accountB);
    }

    /**
     * 获取授权用户的信息
     * @param user 当前用户
     * @return 授权信息
     */
    @GetMapping("/user")
    public Principal user(Principal user){
        return user;
    }
}
