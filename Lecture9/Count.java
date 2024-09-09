package Lecture9;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int cnt=0;
while(n!=0)
{
	cnt+=1;
	n=n/10;
}
System.out.println(cnt);
}

}
