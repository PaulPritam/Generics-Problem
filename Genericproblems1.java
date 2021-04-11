package com.generictestcases;
import com.genericsproblems.Genericsprob;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericTestCases {
    @Test
    void checkingStringInFirstPosition()
    {
        Genericsprob maxvalue = new Genericsprob();
        Comparable max = maxvalue.max("banana","peach","apple");
        Assertions.assertEquals("banana",max);
    }
    @Test
    void checkingStringInSecondPosition()
    {
        Genericsprob maxvalue = new Genericsprob();
        Comparable max = maxvalue.max("apple","banana","peach");
        Assertions.assertEquals("banana",max);
    }
    @Test
    void checkingStringInThirdPosition()
    {
        Genericsprob maxvalue = new Genericsprob();
        Comparable max = maxvalue.max("apple","peach","banana");
        Assertions.assertEquals("banana",max);
    }
}