package com.application;

import com.application.entities.Product;
import com.application.services.interfaces.ProductServiceInterface;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityWithJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityWithJwtApplication.class, args);
    }


    @Bean
    CommandLineRunner start( ProductServiceInterface productServiceBean ){

        return args ->{

            Product product1 = new Product();

            product1.setName("product1");
            product1.setReference("234353");
            product1.setDescription("Description for The product 1");
            product1.setPrice(33F);
            product1.setQuantity(50);

            productServiceBean.addProduct(product1);

            Product product2 = new Product();

            product2.setName("product2");
            product2.setReference("254348");
            product2.setDescription("Description for The product 2");
            product2.setPrice(99F);
            product2.setQuantity(50);

            productServiceBean.addProduct(product2);

            Product product3 = new Product();

            product3.setName("product3");
            product3.setReference("546348");
            product3.setDescription("Description for The product 3");
            product3.setPrice(65F);
            product3.setQuantity(50);

            productServiceBean.addProduct(product3);

        };

    }

}
