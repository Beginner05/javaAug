package Lecture10;
import java.util.Scanner;
public class BinaryToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
//		step 1
//		binary se decimal me jaao
		int res=binaryToDecimal(n);
		int ans=decimalToOctal(res);
		System.out.println(ans);
}
	
	public static int binaryToDecimal(int n)
	{
		int ans=0;
		int multi=1;
		while(n>0)
		{
			int rem=n%10;
			if(rem==1)
			{
				ans=ans+(rem*multi);
				
			}
			multi=multi*2;
			n=n/10;
		}
		return ans;
	}
public static int decimalToOctal(int n)
{
	int ans=0;
	int multi=1;
	while(n>0)
	{
		int rem=n%8;
		if(rem!=0)
		{
			ans=ans+(rem*multi);
		}
		n=n/8;
		multi=multi*10;
	}
	return ans;
}
}
