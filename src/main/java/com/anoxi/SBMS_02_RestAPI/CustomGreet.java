package com.anoxi.SBMS_02_RestAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class CustomGreet {

    @GetMapping("/welcome")
    public String welcome(){

        return "Welcome to Our 1st Website....!";
    }
    @GetMapping("/greet")
    public ResponseEntity<String> greet(@RequestParam("name") String name){
        String msg = name +" ,Good Morning ....!";

        return new ResponseEntity(msg, HttpStatus.OK);
    }

    @GetMapping("/welcome/{name}")
    public ResponseEntity<String> welcome(@PathVariable("name") String name){

        String msg = name +", Welcome to our website";
        System.out.println(msg);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
