package com.lanshiqin.authserver.core.security;

import com.lanshiqin.authserver.core.entity.Account;
import com.lanshiqin.authserver.core.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DomainUserDetailsService implements UserDetailsService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findByUserName(username);
        if (account!=null){
            return new User(account.getUserName(),account.getPassWord(), AuthorityUtils.createAuthorityList(account.getRoles()));
        }else {
            throw  new UsernameNotFoundException("用户["+username+"]不存在");
        }
    }
}
