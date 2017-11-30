package com.znz.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
	public class DemoApplication extends SpringBootServletInitializer {
	 
	    public static void main(String[] args) {
	        SpringApplication.run(applicationClass, args);
	    }
	 
	    @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(applicationClass);
	    }
	 
	    private static Class<DemoApplication> applicationClass = DemoApplication.class;
	}
	 
	@RestController
	class HelloController {
	 
	    @RequestMapping("/hello/{name}")
	    String hello(@PathVariable String name) {
	 
	        return "Hi " + name + " !";
	 
	    }
	}