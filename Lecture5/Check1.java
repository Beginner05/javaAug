package Lecture5;

import java.util.Scanner;

public class Check1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int nsp2 = n - 2;
		for (int i = 0; i < n; i++) {
			// System.out.println(i);
			for (int csp = 0; csp < nsp; csp++) {
				System.out.print(" ");
			}
			for (int cst = 0; cst < nst; cst++) {
				System.out.print("* ");
				for (int csp2 = 0; csp2 < nsp2; csp2++) {
					System.out.print(" ");
				}
			}
			System.out.println();
			nst++;
			nsp--;
		}

	}
}
