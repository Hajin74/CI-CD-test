package org.example.deploytest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class HelloService {

    private final HelloRepository helloRepository;

    @Transactional
    public String generateGreeting(String name) {
        Hello hello = helloRepository.save(new Hello("Hello, " + name));
        return hello.getContent();
    }

}
