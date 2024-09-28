package Lecture13;

import java.util.Scanner;

public class Rotate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello Tripti");
		int arr[]=new int[4];

Scanner scn=new Scanner(System.in);

for(int i=0;i<arr.length;i++)
{
	arr[i]=scn.nextInt();
}
int res[]=new int[arr.length];
	int i=0;
	int j=arr.length-1;
	while(i<arr.length)
	{
		res[i]=arr[j];
		i++;
		j--;
	}
	for(int k=0;k<res.length;k++)
	{
		System.out.print(res[k]+" ");
	}
	}

}
