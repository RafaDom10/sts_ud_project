package com.rafael.ud_project;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rafael.ud_project.domain.Category;
import com.rafael.ud_project.repositories.CategoryRepository;

@SpringBootApplication
public class UdProjectApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(UdProjectApplication.class, args);
	}

	// temporary code for instance categories mocks
	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Games");
		Category cat2 = new Category(null, "Books");
		this.repository.saveAll(Arrays.asList(cat1, cat2));
	}

}
