package com.codecup.demo.config;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI userAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("User CRUD API")
                        .version("1.0")
                        .description("This is a sample Spring Boot API for managing users."));
    }
}
