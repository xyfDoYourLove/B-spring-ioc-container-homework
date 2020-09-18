package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Bar {

    private Foo foo;

    public Bar(Foo foo) {
        this.foo = foo;
    }

    @PostConstruct
    public void init() {
        foo.setBar(this);
    }

    public void hi() {
        System.out.println("Hi, " + foo.name());
    }

    public String name() {
        return "Bar";
    }
}
