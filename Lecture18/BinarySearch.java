package Lecture18;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,12,13,38,55};
Scanner scn=new Scanner(System.in);
	int trgt=scn.nextInt();
	int res=find(trgt,arr);
	System.out.println(res);
	}
	public static  int find(int trgt,int arr[])
	{
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi)
		{
			int mid=(lo+hi)/2;
			if(arr[mid]<trgt)
			{
//				right me jaana h;
				lo=mid+1;
			}
			else if(arr[mid]>trgt)
			{
//				left me jaana h
				hi=mid-1;
			}else {
				return mid;
			}	
		}
		return -1;
	}

}
