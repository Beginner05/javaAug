package Lec10;

public class FunctionWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
int sum=add(a,b);
System.out.println(sum);
	}
	
	public static int add(int a,int b)
	{
		int c=a+b;
		return c;
	}

}
