package com.rest.webservices.restfull.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private MessageSource messageSource;

    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }
    
    @GetMapping("/hello")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello/{name}")
    public HelloWorldBean helloWorldPath(@PathVariable String name){
        return new HelloWorldBean("Hello "+ name+" !!");
    }

    @GetMapping("/internationalized")
    public String helloWorldInternationalized(){

        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null,"Default Message", locale);
        // return "Hello World v2";
    }

}
