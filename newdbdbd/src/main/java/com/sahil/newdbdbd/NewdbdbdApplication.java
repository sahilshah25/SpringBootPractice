package com.sahil.newdbdbd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewdbdbdApplication implements CommandLineRunner {
	private final Userrepository repository;

	@Autowired
	public NewdbdbdApplication(Userrepository repository) {
		this.repository = repository;
	}


	public static void main(String[] args) {
		SpringApplication.run(NewdbdbdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (repository.findAll().isEmpty()) {
			repository.save(new ModelUser("sahil", "ahmad"));
			repository.save(new ModelUser("ahmad", "shah"));
			repository.save(new ModelUser("azaaz", "nabi"));
			repository.save(new ModelUser("nadeem", "ahad"));
		}
		for( ModelUser user:repository.findAll()){
			System.out.println(user);
		}
	}
}
