public class Recursion
{
	public static void main(String[] args)
	{
		int n = 7;

		//Test out the factorial
		System.out.println(n + " factorial equals ");
		System.out.println(Recursion.factorial(n));
		System.out.println();

	}

	public static int factorial(int n)
	{
		int temp;
		if (n==0)
		{
			return 1;
		}
		else
		{
			return (factorial(n-1) *n);
		}
	}
}
