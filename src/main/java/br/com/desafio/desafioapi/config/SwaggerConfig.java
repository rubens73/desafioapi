package br.com.desafio.desafioapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2).select()                                  
          .apis(RequestHandlerSelectors.basePackage("br.com.desafio.desafioapi.resources"))              
          .paths(PathSelectors.regex("/.*"))                          
          .build()
          .apiInfo(apiInfo());                                           
    }
	
	private ApiInfo apiInfo() {
		ApiInfo info = new ApiInfoBuilder().title("API REST Desafio")
				.description("API REST para exibir dados de CNES ativos no Brasil")
    	        .version("1.0.0")
    	        .license("Apache 2.0")
    	        .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
    	        .contact(new Contact("Rubens Pinheiro Lima",
    	        		"https://github.com/rubens73",
    	        		"rubensplima73@gmail.com"))
    	        .build();
		
		return info;
	}
}
