package com.demo.products_intk;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        info = @Info(
                title = "Microservicio products",
                version = "1.0",
                description = "Microservicio que proporciona informacion a modo de catalogo, sobre los productos disponibles.",
                contact = @Contact(
                        name = "Kevin Anderson Palma Lluen",
                        url = "https://github.com/chanchobrujo",
                        email = "umb.kevsidorov@gmail.com"
                )
        ))
@SpringBootApplication
public class ProductsIntkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsIntkApplication.class, args);
    }

}
