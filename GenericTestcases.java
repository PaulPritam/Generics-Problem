package com.generictestcases;
import com.genericsproblems.Genericsprob;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericTestCases {
    @Test
    void checkingInteger()
    {
        Genericsprob maxvalue = new Genericsprob();
        Comparable max = maxvalue.max(90,100,29);
        Assertions.assertEquals(100,max);
    }
    @Test
    void checkingFloat()
    {
        Genericsprob maxvalue = new Genericsprob();
        Comparable max = maxvalue.max(9.5f,1.12f,2.667f);
        Assertions.assertEquals(9.5f,max);
    }
    @Test
    void checkingString()
    {
        Genericsprob maxvalue = new Genericsprob();
        Comparable max = maxvalue.max("apple","peach","banana");
        Assertions.assertEquals("banana",max);
    }



}
