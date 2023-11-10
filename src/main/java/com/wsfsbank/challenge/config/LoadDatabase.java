package com.wsfsbank.challenge.config;


import com.wsfsbank.challenge.data.AccountRepository;
import com.wsfsbank.challenge.model.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Date;
import java.util.UUID;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(AccountRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Account(13245L, "Ishan","ACH", 1000.00,new Date(new java.util.Date().getTime()))));
        };
    }
}