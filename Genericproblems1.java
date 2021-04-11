package com.generictestcases;
import com.genericsproblems.Genericsprob;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericTestCases {
    @Test
    void checkingIntegerForTheFirstPosition()
    {
        Genericsprob maxvalue = new Genericsprob();
        Comparable max = maxvalue.max(900,100,29);
        Assertions.assertEquals(900,max);
    }
    @Test
    void checkingIntegerForTheSecondPosition()
    {
        Genericsprob maxvalue = new Genericsprob();
        Comparable max = maxvalue.max(900,1000,29);
        Assertions.assertEquals(1000,max);
    }
    @Test
    void checkingIntegerForTheThirdPosition()
    {
        Genericsprob maxvalue = new Genericsprob();
        Comparable max = maxvalue.max(900,100,2900);
        Assertions.assertEquals(2900,max);
    }
}