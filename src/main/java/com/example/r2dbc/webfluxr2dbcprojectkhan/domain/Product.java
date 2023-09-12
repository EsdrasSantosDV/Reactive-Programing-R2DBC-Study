package com.example.r2dbc.webfluxr2dbcprojectkhan.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.time.LocalDateTime;


//AQUI NÃO USAMOS ANOTACOES DO JPA
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    private Integer id;

    private String productName;

    private String description;

    private String sku;

    private BigDecimal price;

    //USAMOS DO PROPRIO SPRING


    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private  LocalDateTime lastModifiedDate;

}
