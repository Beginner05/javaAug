package Lecture15;

public class RotateArray {

	public static void main(String args[])
	{
		int k=3;
		int nums[]= {1,2,3,4,5,6,7};
		        int idx=nums.length-(k%nums.length);
		        
		      rotate(nums,idx,nums.length-1);
		        rotate(nums,0,idx-1);
		        rotate(nums,0,nums.length-1);
		}
		    public static void rotate(int arr[],int strt,int end)
		    {
		     int i=strt;
		        int j=end;
		        while(i<j)
		        {
		            int temp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		            i++;
		            j--;
		        }
		    }
			
	}
	
}