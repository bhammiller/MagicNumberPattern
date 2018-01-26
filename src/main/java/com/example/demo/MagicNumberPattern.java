package com.example.demo;

public class MagicNumberPattern {
    public String magicNumbering(Integer input_number){
        String output = "" + input_number;
        if (input_number <= 0) {
            output = "Why did you put in a number less than 1?";
        }
        else{
            while (input_number != 1) {
                if (input_number % 2 == 0) {
                    input_number = input_number / 2;
                } else {
                    input_number = input_number * 3 + 1;
                }
                output = output + "    " + input_number;
                }
            }


        return output;
    }
}
