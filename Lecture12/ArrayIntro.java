package Lecture12;
import java.util.Scanner;
public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[5];
//array ka size kitna h ?
//yeh dekhna h toh ek variable hota h
//jiska naam h length
System.out.println(arr.length);
//	arr[0]=1;
//	arr[1]=2;
//	arr[2]=3;
//	arr[3]=4;
//	arr[4]=5;
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=i+1;
	}
	}
}