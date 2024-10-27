package Lecture17;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,19,0,-2,30};
sort(arr);
	}
	public static void sort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>temp)
			{
				arr[j+1]=arr[j];
			j--;
			}
			arr[j+1]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}