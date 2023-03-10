package com.platzi.javatest.discounts;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorShould {

    @Test
    public void total_zero_when_there_are_prices() {
        PriceCalculator priceCalculator = new PriceCalculator();
        assertEquals(0, priceCalculator.getTotal(), 0);
    }

    @Test
    public void total_is_the_sum_of_prices(){
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.addPrice(10.2);
        priceCalculator.addPrice(15.5);
        assertEquals(0, priceCalculator.getTotal(), 25.7);
    }

    @Test
    public void apply_discount_to_prices(){
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.addPrice(12.5);
        priceCalculator.addPrice(17.5);
        priceCalculator.setDiscount(50);
        assertEquals(0, priceCalculator.getTotal(), 15);
    }

}