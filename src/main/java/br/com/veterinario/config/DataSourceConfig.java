package br.com.veterinario.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
    public class DataSourceConfig {

        @Bean
        public DataSource getDataSource() {
            DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();

            dataSourceBuilder.url("jdbc:mysql://localhost:3306/veterinario");
            dataSourceBuilder.username("root");
            dataSourceBuilder.password("root");
            return dataSourceBuilder.build();
        }
    }
