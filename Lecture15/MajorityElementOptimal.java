package Lecture15;

public class MajorityElementOptimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,3};
 sol(arr);
	}
	 public static int sol(int arr[])
	    {
	        int cnt=0;
	        int val=-1;
	        for(int i=0;i<arr.length;i++)
	        {
	            if(cnt==0)
	            {
	                cnt=1;
	                val=arr[i];
	            }
	            else{
	                if(val==arr[i])
	                {
	                    cnt+=1;
	                }
	                else{
	                    cnt--;
	                }
	            }
	        }
	        return val;
	    }
	}

}
