package Lecture17;

import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int tc=scn.nextInt();
while(tc-->0)
{
	int t1=scn.nextInt();
	int t2=scn.nextInt();
	int t3=scn.nextInt();
	int t4=scn.nextInt();
int nor=scn.nextInt();
int noc=scn.nextInt();
int rick[]=new int[nor];
int cab[]=new int[noc];
for(int i=0;i<rick.length;i++)
{
	rick[i]=scn.nextInt();
	
}
for(int i=0;i<noc;i++)
{
	cab[i]=scn.nextInt();
}
int cost=0;
int msr=0;
int msc=0;
for(int i=0;i<rick.length;i++)
{
	int temp=t1*rick[i];
	msr+=Math.min(temp, t2);
}
msr=Math.min(msr, t3);
for(int i=0;i<cab.length;i++)
{
	int temp=t1*cab[i];
	msc+=Math.min(temp, t2);
}
msc=Math.min(msc,t3);
cost=msc+msr;
cost=Math.min(cost, t4);
System.out.println(cost);
}
	}

}
