package com.lanshiqin.configdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigDashboardApplication.class, args);
	}
}
