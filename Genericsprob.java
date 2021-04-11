package com.genericsproblems;
public class Genericsprob<E extends Comparable> {
    E firstvalue, secondvalue, thirdvalue;
    public void maximumvalue(E firstvalue, E secondvalue, E thirdvalue)
    {
        this.firstvalue = firstvalue;
        this.secondvalue = secondvalue;
        this.thirdvalue = thirdvalue;
    }
    public static <E extends Comparable> E max(E firstvalue, E secondvalue, E thirdvalue)
    {
        E max = firstvalue;
        if(secondvalue.compareTo(max)>0)
        {
            max= secondvalue;
        }
        if (thirdvalue.compareTo(max)>0)
        {
            max= thirdvalue;
        }
        System.out.println(max);
        return max;
    }
    public static void main(String[] args)
    {
        Genericsprob.max(12,24,345);
        Genericsprob.max(1.4f,4.5f,6.4f);
        Genericsprob.max("apple","banana","peach");
    }
}
