package tz.co.ejzoe.usermanament.utility;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
/**
 * @author Ernest Joseph Nzalawahe
 * @created 08/07/2024 - 12:37
 * @project user-manament
 */

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("User Management API")
                        .version("1.0.0")
                        .description("API documentation for the User Management system")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                        .externalDocs(new ExternalDocumentation()
                        .description("User Management For Police officers")
                        .url("https://example.com/docs"));
    }
}
