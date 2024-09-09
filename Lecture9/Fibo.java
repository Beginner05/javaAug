package Lecture9;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int a=0;
int b=1;
if(n==0||n==1)   
{
	System.out.println(n);
	return;
}
for(int i=2;i<=n;i++)
{
	int res=a+b;
	a=b;
	b=res;
}
System.out.println(b);
	}
}