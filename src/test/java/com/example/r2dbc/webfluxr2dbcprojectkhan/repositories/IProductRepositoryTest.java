package com.example.r2dbc.webfluxr2dbcprojectkhan.repositories;

import com.example.r2dbc.webfluxr2dbcprojectkhan.config.DatabaseConfig;
import com.example.r2dbc.webfluxr2dbcprojectkhan.domain.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.r2dbc.DataR2dbcTest;
import org.springframework.context.annotation.Import;

@DataR2dbcTest
//E PRECISMAOS PEGAR A CONFIG PRA TRABALHAR EM TEMPO DE EXECUÇÃO
@Import(DatabaseConfig.class)
class IProductRepositoryTest {

    @Autowired
    IProductRepository productRepository;

    @Test
    void saveNewProduct() {
        productRepository.save(Product.builder().productName("Suco del vale").description("Muito gostoso").build()).subscribe(System.out::println);
    }

}