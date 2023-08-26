package tech.altier.jwtswaggerapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "tech.altier.jwtswaggerapplication.jpa")
@EnableJpaRepositories(basePackages = "tech.altier.jwtswaggerapplication.repository")
public class JwtSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtSwaggerApplication.class, args);
    }

}
