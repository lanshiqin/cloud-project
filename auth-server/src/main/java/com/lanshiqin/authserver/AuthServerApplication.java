package com.lanshiqin.authserver;

import com.lanshiqin.authserver.core.entity.Account;
import com.lanshiqin.authserver.core.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AuthServerApplication {

	@Autowired
	private AccountRepository accountRepository;

	public static void main(String[] args) {
		SpringApplication.run(AuthServerApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "hello, Auth Server!";
	}

	@Autowired
	public void init(){
		Account account = new Account();
		account.setUserName("admin");
		account.setPassWord("admin");
		account.setRoles(new String[]{"ROLE_USER"});
		accountRepository.deleteAll();
		accountRepository.save(account);
	}
}
