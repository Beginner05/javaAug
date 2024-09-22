package Lecture11;

import java.util.Scanner;

public class ConversionAnyToAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte b=-5;
System.out.println(Integer.toBinaryString(b));
		Scanner scn = new Scanner(System.in);
		int b1 = scn.nextInt();
		int b2 = scn.nextInt();
		int val = scn.nextInt();
		if (b1 == 2 && b2 == 10) {
//1	b1==2&&b2==10 yeh binary to decimal hogya
			int ans = binaryToDecimal(val);
			System.out.println(ans);
		}
		if (b1 == 10 && b2 == 2) {
//	2 b1==10&&b2==2 yeh decimal to binary h 
			int ans = decimalToBinary(val);
			System.out.println(ans);
		}

		if (b1 == 8 && b2 == 10) {
//b1==8&&b2=10 yeh octal to decima h
			int ans = octalToDecimal(val);
			System.out.println(ans);
		}

		if (b1 == 10 && b2 == 8) {
//b1=10&&b2==8 yeh decimal se octal h
			int ans = decimalToOctal(val);
			System.out.println(ans);
		}
		if (b1 == 2 && b2 == 8) {
//	mtlb h ki me binary se octal me jaa rha h;
//	step1: aap jaao binary se decimal me
//	step2:app jaao decimal se binary me;
			int res = binaryToDecimal(val);
			int ans = decimalToOctal(res);
			System.out.println(ans);
		}
		if (b1 == 8 && b2 == 2) {
//	mtlb me octal se binary me jaa rha hun
//	step1: octal se decimal me jaao
//	step2: decimal se bnary me jaao
			int res = octalToDecimal(val);
			int ans = decimalToBinary(res);
			System.out.println(ans);

		}
	}

	public static int decimalToOctal(int val) {
//	divide hoga 8 se or multiply hoga 10 se
//	jiss base me jaa rhe h usse divide jisse jaa
//	rhe h usse multi ply
		int multi = 1;
		int ans = 0;
		while (val > 0) {
			int rem = val % 8;
			ans = ans + (rem * multi);
			multi = multi * 10;
			val = val / 8;
		}
		return ans;
	}

	public static int octalToDecimal(int val) {
		int multi = 1;
		int ans = 0;

		while (val > 0) {
			int rem = val % 10;
			ans = ans + (multi * rem);
			multi = multi * 8;
			val = val / 10;
		}
		return ans;
	}

	public static int binaryToDecimal(int val) {
		int ans = 0;
		int multi = 1;
		while (val > 0) {
			int rem = val % 10;
			ans = ans + (rem * multi);
			multi = multi * 2;
			val = val / 10;
		}
		return ans;
	}

	public static int decimalToBinary(int val) {
		int multi = 1;
		int ans = 0;
		while (val > 0) {
			int rem = val % 2;
			ans = ans + (rem * multi);
			multi = multi * 10;
			val = val / 2;
		}
		return ans;
	}
}
