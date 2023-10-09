package com.example.demo.router;

import com.example.demo.handler.PersonHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import org.springframework.http.MediaType;

import static org.springframework.web.reactive.function.server.RequestPredicates.contentType;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class PersonRouter {

    @Bean
    public RouterFunction<ServerResponse> personRouterBean(PersonHandler personHandler) {
        return route().GET("/person/{personId}", personHandler::handleGetPersonById).build();
    }
}
