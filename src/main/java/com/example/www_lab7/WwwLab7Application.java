package com.example.www_lab7;

import com.example.www_lab7.backend.enums.ProductStatus;
import com.example.www_lab7.backend.models.Product;
import com.example.www_lab7.backend.repositories.ProductRepository;
import net.datafaker.Faker;
import net.datafaker.providers.base.Device;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class WwwLab7Application {

    public static void main(String[] args) {
        SpringApplication.run(WwwLab7Application.class, args);
    }
    private ProductRepository productRepository;
    CommandLineRunner createSampleProduct(){
        return arg -> {
            Faker faker = new Faker();
            Random rnd = new Random();
            Device devices = faker.device();
            for(int i = 0; i< 200; i++){
                Product product = new Product(
                        devices.modelName(),
                        faker.lorem().paragraph(30),
                        "piece",
                        devices.manufacturer(),
                        ProductStatus.ACTIVE
                );
                productRepository.save(product);
            }
        };
    }

}
