package com.orange.ihm_eclipse.GENOS.web.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@RequestMapping(value="/HelloWorld", method=RequestMethod.GET)
    public String Exemple() {
        return "Hello World";
    }
}
