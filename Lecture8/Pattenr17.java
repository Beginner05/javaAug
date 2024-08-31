package Lecture8;

import java.util.Scanner;

public class Pattenr17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int nst=n/2;
int nsp=12;
for(int row=0;row<n;row++) {
//	stars
	for(int cst=0;cst<nst;cst++)
	{
		System.out.print("* ");
	}
//	space
	for(int csp=0;csp<nsp;csp++)
	{
		System.out.print("  ");
	}
	for(int cst=0;cst<nst;cst++)
	{
		System.out.print("* ");
	}
	System.out.println();
	if(row<n/2)
	{
		nsp+=2;
		nst--;
	}
	else {
		nsp-=2;
		nst++;
	}
}
	}

}
