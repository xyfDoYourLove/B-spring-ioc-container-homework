package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController implements ApplicationContextAware {

    private GreetingService greetingService;

    private ApplicationContext context;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        System.out.println("++GreetingController init++");
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String greet() {
        this.greetingService = context.getBean(GreetingService.class);
        return greetingService.sayHi();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}
