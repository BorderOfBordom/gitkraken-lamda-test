public class Runner
{
	interface PrintQuotient
	{
		void printQuotient(float a, float b);
	}

	public Runner()
	{
		PrintQuotient func = (a,b) -> System.out.printf("The quotient of %.3f and %.3f is: %.3f\n", a, b, a/b);
		func.printQuotient(1.0f, 2.0f);
	}

	public static void main(String[] args)
	{
		Runner app = new Runner();
	}
}