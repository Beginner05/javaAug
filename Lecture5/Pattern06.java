package Lecture5;

import java.util.Scanner;

public class Pattern06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n;
		int nsp = 0;
		for (int row = 0; row < n; row++) {
//	space;
			for (int csp = 0; csp < nsp; csp++) {
				System.out.print(" ");
			}
//	stars;
			for (int cst = 0; cst < nst; cst++) {
				System.out.print("* ");
			}
			System.out.println();
			nsp += 2;
			nst--;

		}
	}

}
