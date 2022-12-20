package com.platzi.javatest.reto2;

public class FizzBuzz {


    public static String returnName(int num) {
        if((num % 3 == 0) && (num % 5 == 0)) return "FizzBuzz";
        if(num % 3 == 0) return "Fizz";
        if(num % 5 == 0) return "Buzz";

        return ""+num;
    }
}
