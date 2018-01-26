package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
    @RequestMapping ("/")
    public String magic_numberer(@RequestParam("number") int input_number){
        MagicNumberPattern magicNumber = new MagicNumberPattern();
        String result = magicNumber.magicNumbering(input_number);
        return "Your web page prints:<br/>Starting Number: " + input_number + "<br/>" + result;

    }
}