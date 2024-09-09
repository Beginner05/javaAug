package Lecture10;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
//decimal se binary pr lekr jaana h toh 2 se divide
//or 10 se multiply
int multi=1;
int ans=0;
while(n>=1)
{
	int rem=n%2;
	if(rem==1)
	{
		ans=ans+(multi*rem);
	}
	multi=multi*10;
	n=n/2;
}

System.out.println(ans);
	}

}
