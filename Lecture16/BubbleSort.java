package Lecture16;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("enter the size of an array");	
int n=scn.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{
	arr[i]=scn.nextInt();
}
sort(arr);
	}
	
	public static void sort(int arr[])
	{
//		logo ko shi jgha rakhne wale kaam mujhe n-1 time krna tha
		for(int i=0;i<arr.length-1;i++)
		{
			boolean flag=true;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{flag=false;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(flag==true)
			{
				break;
			}
		}
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}
	}
	}