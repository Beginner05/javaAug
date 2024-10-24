package Lecture15;

public class MajorityElement1Bruteforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,2,2,2};
		sol(arr);
	}
	public static int sol(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int cnt=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]==arr[i])
                {
                    cnt+=1;
                }
            }
            if(cnt>arr.length/2)
            {
                return arr[i];
            }
        }
        return -1;
    }
    
}
