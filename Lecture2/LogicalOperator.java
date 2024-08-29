package Lecture2;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=19;
int gender_code=1;
if(gender_code==0)
{
if(age>=18&&gender_code==0&&age%2==0)
{
	System.out.println("Ladka vote de skta h");
}
else {
	System.out.println("Ladka vote nhi de skta");
}
}
else {
	

	if(age>=18&&gender_code==1&&age%2!=0)
	{
		System.out.println("Ladki vote de skte h");
	}

	}
	}
}
