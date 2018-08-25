public class MonthlyLoans 
{
	public static void main(String [] args)
	{
		String a="Years:     15      20      25      30";
		System.out.printf("%-30s\n", a);
		for(int i=1; i<=47; i++)
		{
			System.out.printf("%c", '_');
		}
		System.out.print("\n");
		for(double t=3.0; t<=6.0; t+=.5)
		{
			System.out.printf("%-4s%c%s", t, '%', "    ");
			for(int y=15; y<=30; y+=5)
			{
				System.out.printf("%.2f %c",(monthlyPaymentOnLoan(100000.0,y,t)),' ');
			}
			System.out.print("\n");
		}
	}
	public static double monthlyPaymentOnLoan(double initP, int y, double APR)
	{
		final int months = 12;
		double r=APR/months/100;
		int n=y*12;
		double m=initP * r;
			   m*= (Math.pow((1+r),n));
			   m/= (Math.pow((1+r),n)-1);
		return m;
	}
}
