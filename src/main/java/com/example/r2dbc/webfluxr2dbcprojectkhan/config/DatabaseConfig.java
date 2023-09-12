package com.example.r2dbc.webfluxr2dbcprojectkhan.config;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;



//isso vai Inicializar nosso h2 ele automaticamente vai criar o banco de dados e a tabela
@Configuration
//PRECISAMOS DESSA CONFIGURAÇÃO PARA O SPRING GERAR O CREATEDDATE E O LASTMODIFIEDDATE
@EnableR2dbcAuditing
public class DatabaseConfig {

    @Value("classpath:/schema.sql")
    Resource resource;

    @Bean
    ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory){
        ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
        initializer.setConnectionFactory(connectionFactory);
        initializer.setDatabasePopulator(new ResourceDatabasePopulator(resource));
        return initializer;
    }
}