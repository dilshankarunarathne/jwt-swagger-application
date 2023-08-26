package tech.altier.jwtswaggerapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "tech.altier.jwtswaggerapplication.jpa")
public class JwtSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtSwaggerApplication.class, args);
    }

}
