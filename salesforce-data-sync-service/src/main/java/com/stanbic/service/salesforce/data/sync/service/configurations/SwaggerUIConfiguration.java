package com.stanbic.service.salesforce.data.sync.service.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.client.LinkDiscoverer;
import org.springframework.hateoas.client.LinkDiscoverers;
import org.springframework.hateoas.mediatype.collectionjson.CollectionJsonLinkDiscoverer;
import org.springframework.plugin.core.SimplePluginRegistry;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration
public class SwaggerUIConfiguration {
    @Bean
    public Docket swaggerConfiguration() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(this.apiDetails())
//                .securityContexts(Arrays.asList(securityContext()))
//                .securitySchemes(Arrays.asList(apiKey()))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.stanbic.service.salesforce.data.sync.service.controllers"))
                .paths(PathSelectors.ant("/**"))
                .build();
    }

    private ApiInfo apiDetails() {
        return new ApiInfo(
                "Salesforce Data Sync Rest Service",
                "Microservice for Salesforce Data Sync Rest Service",
                "1.0",
                "Free to use",
                new springfox.documentation.service.Contact("", "", "victor.nwike@stanbicibtc.com"),
                "" +
                        "License",
                "", Collections.emptyList());
    }

    @Bean
    public LinkDiscoverers discoverers() {
        List<LinkDiscoverer> plugins = new ArrayList<>();
        plugins.add(new CollectionJsonLinkDiscoverer());
        return new LinkDiscoverers(SimplePluginRegistry.create(plugins));
    }

//    private ApiKey apiKey() {
//        return new ApiKey("JWT", "Authorization", "header");
//    }
//
//    private SecurityContext securityContext() {
//        return SecurityContext
//                .builder()
//                .securityReferences(defaultAuth()).build();
//    }
//
//    private List<SecurityReference> defaultAuth() {
//        AuthorizationScope authorizationScope = new AuthorizationScope(
//                "global",
//                "accessEverything");
//
//        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
//        authorizationScopes[0] = authorizationScope;
//
//        return Arrays.asList(new SecurityReference("JWT", authorizationScopes));
//    }
}
