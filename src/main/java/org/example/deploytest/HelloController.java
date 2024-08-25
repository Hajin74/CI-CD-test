package org.example.deploytest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class HelloController {

    private final HelloService helloService;

    @GetMapping("/{name}")
    public String generateGreeting(@PathVariable String name) {
        return helloService.generateGreeting(name);
    }
}
