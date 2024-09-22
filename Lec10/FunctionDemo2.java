package Lec10;

public class FunctionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
sum();
System.out.println("sum hogya");
multi();
System.out.println("multi hogya");
sub();
System.out.println("sub hogya");
divide();
System.out.println("divide hogya");

	}
public static void sum()
{
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}
public static void sub()
{
	int a=10;
	int b=20;
	int c=b-a;
	System.out.println(c);
}
public static void divide()
{
	int a=10;
	int b=20;
	System.out.println(a/b);
}

public static void multi()
{
int a=10;
int b=20;
int c=a*b;
System.out.println(c);
}
}
