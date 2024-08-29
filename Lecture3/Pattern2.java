package Lecture3;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		nst ka mtlb kitne stars h;
//		cst ka mtlb kitne stars print kre
//int nst=1;
//// nst=no of stars in first line;
//for(int row=0;row<5;row++)
//{
////	cst =counter of stars;
//	for(int cst=0;cst<nst;cst++)
//	{
//		System.out.print("*");
//	}
//	nst++;
//	System.out.println();
//}
		int nst=5;
		for(int row=0;row<5;row++)
		{
			for(int cst=0;cst<nst;cst++)
			{
				System.out.print("*");
			}
			nst--;
			System.out.println();
		}
	}

}
