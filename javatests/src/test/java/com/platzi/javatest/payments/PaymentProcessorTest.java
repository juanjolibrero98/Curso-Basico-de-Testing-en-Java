package com.platzi.javatest.payments;

import com.platzi.javatest.util.StringUtil;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;


    @Before
    public void setUp() {
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void payment_is_correct() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

         assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void payment_is_wrong() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        assertFalse(paymentProcessor.makePayment(1000));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3() {
        StringUtil.repeat("hola",-1);
    }

    @Test
    public void test4() {
        assertFalse(StringUtil.isEmpty("hohoho"));
    }

    @Test
    public void test5() {
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void test6() {
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void test7() {
        assertTrue(StringUtil.isEmpty("  "));
    }

}