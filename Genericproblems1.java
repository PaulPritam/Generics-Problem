package com.genericassignment;

public class Genericproblems<E,F,G,H> {
	E[]x;
	F[]y;
	G[]z;
	public Genericproblems(E[]x, F[]y, G[]z)
	{
		this.x= x;
		this.y= y;
		this.z= z;
		
	}
	public E max()
	{
		return Genericproblems.maxm(x, y, z);
	}
	public static Integer maxm(Integer x, Integer y, Integer z)
	{
		Integer max = x;
		if(y.compareTo(max)>0)
		{
			max=y;
		}
		if (z.compareTo(max)>0)
		{
			max=z;
		}
		printmax(x,y,z,max);
		return max;
	}
	private static <E> void printmax(Integer x, Integer y, Integer z, Integer max) {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(max);
		
	}
	public static void main(String[] args) 
	{
		Integer xInt = 300;
		Integer yInt = 40;
		Integer zInt = 7;
		Genericproblems.maxm(xInt, yInt, zInt);	
		
		Integer aInt = 300;
		Integer bInt = 400;
		Integer cInt = 7;
		Genericproblems.maxm(aInt, bInt, cInt);
		
		Integer aIntx = 300;
		Integer bInty = 400;
		Integer cIntz = 700;
		Genericproblems.maxm(aIntx, bInty, cIntz);
	}

}
