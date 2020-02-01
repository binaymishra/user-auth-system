package com.system.auth.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class UserAuthSystemApplication implements CommandLineRunner {
		
	@Autowired
	AuthUserRestRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(UserAuthSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new AuthUser(1L, "binayM"));
		repository.save(new AuthUser(2L, "vinayM"));
		System.out.println("=======================================");
		repository.findAll().forEach(u -> System.out.println(u));
		System.out.println("=======================================");
	}
}
