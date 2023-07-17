package com.jw.accounts.constant;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info =
@Info(title = "Account", version = "1.0", description = "Account API Documentation")
)
@SecurityScheme(
       name = "BearerToken",
       type = SecuritySchemeType.HTTP,
       bearerFormat = "JWT",
       scheme = "bearer"
)
public class SwaggerConfig {
   @Bean
   public OpenAPI customOpenAPI(@Value("${springdoc.version}") String appVersion) {
       return new OpenAPI()
               .components(new Components())
               .info(new io.swagger.v3.oas.models.info.Info().title("Account API").version(appVersion));
   }



}
