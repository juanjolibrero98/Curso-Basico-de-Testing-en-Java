package com.platzi.javatest.reto2;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsShould {

    @Test
    public void     test(){
        assertEquals("I", RomanNumerals.arabicToRoman(1));
        assertEquals("IV", RomanNumerals.arabicToRoman(4));
        assertEquals("IX", RomanNumerals.arabicToRoman(9));
        assertEquals("XIV", RomanNumerals.arabicToRoman(14));
        assertEquals("XIX", RomanNumerals.arabicToRoman(19));
        assertEquals("XXIV", RomanNumerals.arabicToRoman(24));
        assertEquals("XL", RomanNumerals.arabicToRoman(40));
        assertEquals("XLIX", RomanNumerals.arabicToRoman(49));
        assertEquals("XC", RomanNumerals.arabicToRoman(90));
        assertEquals("XCIX", RomanNumerals.arabicToRoman(99));
        assertEquals("CD", RomanNumerals.arabicToRoman(400));
        assertEquals("CM", RomanNumerals.arabicToRoman(900));
    }

}