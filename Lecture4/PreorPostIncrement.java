package Lecture4;

public class PreorPostIncrement {

	public static void main(String[] args) {

		int a=10;
		int b=30;
		int c=8;
		int d=a+ b+ c + --c + --a+ ++b;
		int ans=a + b + a + b+c -a + b + c- ++b - --c + b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(ans);

	}

}
