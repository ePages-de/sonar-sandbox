package com.epages.sonarsandbox;

import java.util.ArrayList;
import java.util.Set;

import org.springframework.util.StringUtils;

public class HelloService {

    public String sayHelloWithNoCoverage() {
        return Greetings.createMessage();
    }

    public String sayHelloDuplicate() {
        return Greetings.createMessage();
    }

    public String sayHello1() {
        return Greetings.createMessage();
    }

    public String sayHello2() {
        return Greetings.createMessage();
    }
}
