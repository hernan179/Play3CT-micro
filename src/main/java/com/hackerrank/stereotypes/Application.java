package com.hackerrank.stereotypes;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class Application  extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

@Configuration
    public static class DatabaseConnection {
       DataSource dataSource() {
    	   DataSourceBuilder<?> dataSource = DataSourceBuilder.create();
    	   dataSource.driverClassName("jdbc.h2.Driver");
    	   dataSource.url("jdbc:h2:file:rc/test/dbh2");
    	   dataSource.username("sa");
    	   dataSource.password("");
    	   return dataSource.build();
       }
    }

    public static class Message {

    }
}





