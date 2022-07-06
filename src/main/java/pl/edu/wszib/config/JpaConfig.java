package pl.edu.wszib.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

    @Configuration
    @EnableJpaRepositories(basePackages = "pl.edu.wszib.dao")
    public class JpaConfig {

    }

