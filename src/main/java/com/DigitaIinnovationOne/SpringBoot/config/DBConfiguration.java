package com.DigitaIinnovationOne.SpringBoot.config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@SpringBootApplication
public class DBConfiguration {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String testeDataBaseConnection(){
        System.out.println ("DB connection for DEV - h2");
        System.out.println (driverClassName);
        System.out.println (url);

        return "DB Connection to H2_TEST - Teste instance";
    }

    @Profile("prod")
    @Bean
    public String productDataBaseConnection(){
        System.out.println ("DB connection for Production - MySQL");
        System.out.println (driverClassName);
        System.out.println (url);

        return "DB Connection to MySQL_PROD - Production instance";
    }
    @SpringBootApplication
    public static class Application {
        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }
    }
}


