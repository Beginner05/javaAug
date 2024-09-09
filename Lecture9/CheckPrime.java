package Lecture9;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		boolean flag = true;
//agr flag me true h iska mtlb no prime h 
//agr flag me false h iska mtlb no not prime h

		int n = scn.nextInt();
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				flag = false;
//		System.out.println("Not Prime");

				break;
			}
		}
		if (flag == true) {
			System.out.println("Prime");
		}
		if (flag == false) {
			System.out.println("Not prime h ");
		}
	}
}
