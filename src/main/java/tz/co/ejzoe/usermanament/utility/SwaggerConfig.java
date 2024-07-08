package tz.co.ejzoe.usermanament.utility;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Ernest Joseph Nzalawahe
 * @created 08/07/2024 - 12:37
 * @project user-manament
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis((RequestHandlerSelectors.basePackage("tz.co.ejzoe.usermanament.rest")))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Your API Title")
                .description("Your API Description")
                .version("1.0.0")
                .termsOfServiceUrl("https://example.com/terms")
                .license("Your License")
                .licenseUrl("https://example.com/license")
                .build();
    }
}
