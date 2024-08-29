package Lecture2;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 19;
		int gender = 0;
// agr gender =0 h toh male
//agr gender =1 h toh female;
		if (age >= 18) {
			if (gender == 0) // male ki baat ho rhe h;
			{
				if (age % 2 == 0) {
					System.out.println("Yeh ladka vote de skta h ");
				} else {
					System.out.println("Yeh ladka vote nhi de skta");
				}
			} else // female ki baat horhe h
			{
				if (age % 2 == 0) {
					System.out.println("Yeh ladki vote nhi de skti h ");
				} else {
					System.out.println("Yeh ladki vote de skti h ");
				}
				
			}

		} else {
			System.out.println("Jaane do isse ");
		}
	}

}
