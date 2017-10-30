package com.lanshiqin.authserver.core.repository;

import com.lanshiqin.authserver.core.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface AccountRepository extends MongoRepository<Account, String> {

    Account findByUserName(String username);
}
