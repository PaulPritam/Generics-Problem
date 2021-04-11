package com.generictestcases;
import com.genericsproblems.Genericsprob;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericTestCases {
    @Test
    void checkingFloatForFirstPosition()
    {
        Genericsprob maxvalue = new Genericsprob();
        Comparable max = maxvalue.max(9.5f,1.12f,2.667f);
        Assertions.assertEquals(9.5f,max);
    }
    @Test
    void checkingFloatForSecondPosition()
    {
        Genericsprob maxvalue = new Genericsprob();
        Comparable max = maxvalue.max(5.5f,9.12f,2.667f);
        Assertions.assertEquals(9.12f,max);
    }
    @Test
    void checkingFloatForThirdPosition()
    {
        Genericsprob maxvalue = new Genericsprob();
        Comparable max = maxvalue.max(5.5f,9.12f,22.667f);
        Assertions.assertEquals(22.667f,max);
    }
}