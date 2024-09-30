package DivideAndConquer;
import java.util.Scanner;
public class AxisOrbit_Leetcode647 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
String str=scn.next();
sol(str);
	}
	public static int sol(String str)
	{
	int cnt=0;
//	yeh loop lga h hr index pr axis bnane k liye
	for(int i=0;i<str.length();i++)
	{
		cnt+=1;
		int val=1;
		while(i-val>=0&&i+val<str.length())
		{
			if(str.charAt(i-val)==str.charAt(i+val))
			{
				cnt++;
			}
			else {
				break;
			}
			val++;
		}
	}
	for(double i=0.5;i<str.length();i++)
	{
		double val=0.5;
		while(i+val<str.length()&&i-val>=0)
		{
			if(str.charAt((int)(i+val))==str.charAt((int)(i-val)))
			{
				cnt+=1;
			}
			else {
				break;
			}
			val+=1;
		}
	}
	return cnt;
	}

}
