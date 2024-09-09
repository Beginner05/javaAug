package Lecture10;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int multi = 1;
		int ans = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem != 0) {
				ans = ans + (multi * rem);
			}
			n = n / 10;
			multi = multi * 8;
		}
		System.out.println(ans);

//	System.out.println(val);
	}

}
