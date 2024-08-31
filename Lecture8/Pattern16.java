package Lecture8;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n;
		int nsp = n - 1;
		for (int row = 0; row < 2 * n - 1; row++) {
//	space;
			for (int csp = 0; csp < nsp; csp++) {
				System.out.print("  ");
			}
//	stars
			for (int cst = 0; cst < nst; cst++) {
				System.out.print("* ");
			}
			System.out.println();
			if (row < n - 1) {
				nsp--;
				nst--;
			} else {
				nsp++;
				nst++;
			}

		}
	}

}
