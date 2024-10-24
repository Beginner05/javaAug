package DivideAndConquer;
import java.util.*;
public class check {

public static void main(String args[])
{
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
//	sol(arr,5);
int res=-1%3;
System.out.println(res);
}
    public  static boolean sol(int arr[],int k)
    {
        HashMap<Integer,ArrayList<Integer>>map=new HashMap();
        for(int i=0;i<arr.length;i++)
        {
            int rem=arr[i]%k;
            if(map.containsKey(rem))
            {
                map.get(rem).add(i);
            }
            else{
            map.put(rem,new ArrayList());
                map.get(rem).add(i);
            }
            
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==Integer.MIN_VALUE)
            {
                continue;
            }
            int rem=arr[i]%k;
           int temp=k-rem;
            boolean flag=false;
            while(map.containsKey(temp)&&map.get(temp).size()>0)
            {
                int idx=map.get(temp).get(0);
                if(idx!=i)
                {
                    arr[idx]=Integer.MIN_VALUE;
                    flag=true;
                    map.get(temp).remove(0);
                    break;
                }
                else{
                    map.get(temp).remove(0);
                    continue;
                }
            }
            if(!flag)return false;
        }
        return true;
    }
}

