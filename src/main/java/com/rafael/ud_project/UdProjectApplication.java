package com.rafael.ud_project;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rafael.ud_project.domain.Category;
import com.rafael.ud_project.domain.Product;
import com.rafael.ud_project.repositories.CategoryRepository;
import com.rafael.ud_project.repositories.ProductRepository;

@SpringBootApplication
public class UdProjectApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository catRepository;
	@Autowired
	private ProductRepository prodRepository;

	public static void main(String[] args) {
		SpringApplication.run(UdProjectApplication.class, args);
	}

	// temporary code for instance categories mocks
	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Games");
		Category cat2 = new Category(null, "Books");
		
		Product prod1 = new Product(null, "PlaysStation 5", 5000.00);
		Product prod2 = new Product(null, "Xbox Series S", 3000.00);
		Product prod3 = new Product(null, "Livro Clean Code", 100.00);

		cat1.getProducts().addAll(Arrays.asList(prod1, prod2));
		cat2.getProducts().addAll(Arrays.asList(prod3));

		prod1.getCategories().addAll(Arrays.asList(cat1));
		prod2.getCategories().addAll(Arrays.asList(cat1));
		prod3.getCategories().addAll(Arrays.asList(cat2));

		catRepository.saveAll(Arrays.asList(cat1, cat2));
		prodRepository.saveAll(Arrays.asList(prod1, prod2, prod3));
	}

}
