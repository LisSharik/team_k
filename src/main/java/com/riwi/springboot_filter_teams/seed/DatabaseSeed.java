package com.riwi.springboot_filter_teams.seed;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.riwi.springboot_filter_teams.domain.entities.Product;
import com.riwi.springboot_filter_teams.domain.repositories.ProductRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class DatabaseSeed implements CommandLineRunner {

    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i <= 10; i++) {
            Product product = new Product();
            product.setName("Camisa Riwi " + i);
            product.setPrice(20000 + (i * 1000));
            productRepository.save(product);
        }

    }


}
