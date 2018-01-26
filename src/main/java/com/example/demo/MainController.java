package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MainController {
    @RequestMapping ("/")
    public String magic_numberer(@RequestParam("number") int input_number){
        MagicNumberPattern magicNumber = new MagicNumberPattern();
        return magicNumber.magicNumbering(input_number);

    }
}
/*
@RequestMapping("/getname")
    public String showWithName(@RequestParam("county") String name,@RequestParam("age") int age)
    {

        return name+" "+age;
    }
    */