package com.example.r2dbc.webfluxr2dbcprojectkhan.bootstrap;

import com.example.r2dbc.webfluxr2dbcprojectkhan.domain.Product;
import com.example.r2dbc.webfluxr2dbcprojectkhan.repositories.IProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {

    //DEPENDENCIAS NECESSARIAS
    private final IProductRepository productRepository;


    @Override
    public void run(String... args) throws Exception {
        populateProducts();
        productRepository.count().subscribe(count -> System.out.println("Number of products: " + count));

    }

    private void populateProducts() {
        productRepository.count().subscribe(count -> {
            if (count == 0) {
                Product productOne = Product.builder().productName("Mango Bobs").description("Tasty").sku("12345").price(new BigDecimal("12.99")).createdDate(LocalDateTime.now()).lastModifiedDate(LocalDateTime.now()).build();

                Product productTwo = Product.builder().productName("Mango Bobs").description("Tasty").sku("12345").price(new BigDecimal("12.99")).createdDate(LocalDateTime.now()).lastModifiedDate(LocalDateTime.now()).build();
                Product productThree = Product.builder().productName("Mango Bobs").description("Tasty").sku("12345").price(new BigDecimal("12.99")).createdDate(LocalDateTime.now()).lastModifiedDate(LocalDateTime.now()).build();

                productRepository.save(productOne).subscribe();
                productRepository.save(productTwo).subscribe();
                productRepository.save(productThree).subscribe();
            }
        });
    }

}