package Lecture4;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int nst=5;
int nsp=0;
for(int row=0;row<5;row++)
{
//	space
	for(int csp=0;csp<nsp;csp++)
	{
		System.out.print(" ");
	}
//	stars;
	for(int cst=0;cst<nst;cst++)
	{
		System.out.print("*");
	}
	nst--;
	nsp++;
	System.out.println();
}
	}

}
