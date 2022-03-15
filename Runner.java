public class Runner
{
	//Shaurya learned how to merge branches with different code into one runner class while solving persisting errors
	interface PerfectSquare
	{
		boolean checkPerfect(int num);
	}

	interface PrintQuotient
	{
		void printQuotient(float a, float b);
	}

	public Runner()
	{
		PerfectSquare cP = (int num) ->
		{
			int x = (int)(Math.sqrt(num));
			return (x*x == num);
		};

		System.out.println("Perfect Square (81): " + cP.checkPerfect(81));
		System.out.println("Perfect Square (50): " + cP.checkPerfect(50));
		PrintQuotient func = (a,b) -> System.out.printf("The quotient of %.3f and %.3f is: %.3f\n", a, b, a/b);
		func.printQuotient(1.0f, 2.0f);
	}

	public static void main(String[] args)
	{
		Runner app = new Runner();
	}
}