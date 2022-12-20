package com.platzi.javatest.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilTest {

    @Test
    public void repeat_string_one_time() {
        Assert.assertEquals("hola", StringUtil.repeat("hola",1));
    }

    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola",3));
    }

    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("hola",0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("hola",-1);
    }

    @Test
    public void notEmptyString() {
        assertFalse(StringUtil.isEmpty("hohoho"));
    }

    @Test
    public void isEmptyString() {
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void nullIsEmptyString() {
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void spaceIsEmptyString() {
        assertTrue(StringUtil.isEmpty("  "));
    }

}