package com.platzi.javatest.reto2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzShould {

    @Test
    public void if_num_is_divisible_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.returnName(9));
    }
    @Test
    public void if_num_is_divisible_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.returnName(10));
    }
    @Test
    public void if_num_is_divisible_by_3_and_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.returnName(15));
    }

}