package Lecture13;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {-1,-13,-2,-5};

int max=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
	if(max<arr[i])
	{
		max=arr[i];
	}
}
System.out.println(max);
	}

}
