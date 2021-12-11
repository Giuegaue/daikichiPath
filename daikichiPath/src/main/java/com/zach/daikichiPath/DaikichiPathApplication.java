package com.zach.daikichiPath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class DaikichiPathApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaikichiPathApplication.class, args);
    }
    
    @RequestMapping("/m/daikichi/travel/{city}")
    public String travel(@PathVariable("city") String city){
    	return "Congratulations! You will soon travel to " + city + "!";
    } 
    
    @RequestMapping("/m/daikichi/lotto/{num}")
    public String fortuneCookie(@PathVariable("num")  int num){
    	String even = "You will take a grand journey in the near future, but be weary of tempting offers.";
    	String odd = "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    	return num %2 == 0 ? even : odd;
    }
}