package Lecture14;

public class RotateArray {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
sol("abc","ccccbbbbaaaa");
	}
	 public static boolean sol(String s1,String s2)
	    {
	        long ans=0;
	        for(int i=0;i<s1.length();i++)
	        {
	            ans=ans+(s1.charAt(i)-96)+30;
	        }
	        long res=0;
	        int i=0;
	        int j=0;
	        while(j<s2.length()){
	        res+=(s2.charAt(j)-96)+30;
	            if(res>ans)
	            {
	                res=res-(s2.charAt(i)-96)-30;
	                i++;
	            }
	            j++;
	        if(res==ans)return true;
	        }
	        
	        return false;
	    }
}