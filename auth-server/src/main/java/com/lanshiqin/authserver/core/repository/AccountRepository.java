package com.lanshiqin.authserver.core.repository;

import com.lanshiqin.authserver.core.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

/**
 * 账户数据库操作类
 * MongoDB操作接口
 */
@Component
public interface AccountRepository extends MongoRepository<Account, String> {

    /**
     * 根据用户名查找账户信息
     * @param username 用户名
     * @return 账户信息
     */
    Account findByUserName(String username);
}
