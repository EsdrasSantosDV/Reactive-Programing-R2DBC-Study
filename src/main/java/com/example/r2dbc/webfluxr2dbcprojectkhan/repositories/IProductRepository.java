package com.example.r2dbc.webfluxr2dbcprojectkhan.repositories;

import com.example.r2dbc.webfluxr2dbcprojectkhan.domain.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IProductRepository extends ReactiveCrudRepository<Product, Integer> {


}
