package com.example.simpleapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Olá, mundo. meu nome é Thiago e Estou testando minha API :)!";
    }

    @GetMapping("/users")
    public List<String> getUsers() {
        return List.of("Thiago", "Tamirez", "Maria", "João");
    }
}

