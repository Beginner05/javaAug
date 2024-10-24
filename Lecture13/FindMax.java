package Lecture13;

import java.util.Scanner;

public class FindMax {

	  public static void main(String []argh)
	    {
	Scanner scn=new Scanner(System.in);
	int tc=scn.nextInt();
	while(tc-->0)
	{
	    long temp=0;
	    try{
	        long val=scn.nextLong();
	    temp=val;
	    }
	    catch(Exception e)
	    {
	        System.out.println("can't be fitted");
	    }
	    System.out.println(temp+" can be fitted in:");
	    if(temp<=Byte.MIN_VALUE&&temp<=Byte.MAX_VALUE)
	    {
	        System.out.println("byte");
	    }
	    
	    if(temp<=Short.MIN_VALUE&&temp<=Short.MAX_VALUE)
	    {
	        System.out.println("short");
	    }
	    
	    if(temp<=Integer.MIN_VALUE&&temp<=Integer.MAX_VALUE)
	    {
	        System.out.println("int");
	    }
	    
	    if(temp<=Long.MIN_VALUE&&temp<=Long.MAX_VALUE)
	    {
	        System.out.println("long");
	    }
	}
	    }
	}

	       