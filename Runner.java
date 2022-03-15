public class Runner
{
	public Runner()
	{
		PerfectSquare cP = (int num) ->
		{
			int x = (int)(Math.sqrt(num));
			return (x*x == num);
		};

		System.out.println("Perfect Square (81): " + cP.checkPerfect(81));
		System.out.println("Perfect Square (50): " + cP.checkPerfect(50));
	}

	interface PerfectSquare
	{
		boolean checkPerfect(int num);
	}

	public static void main(String[]args)
	{
		Runner runner = new Runner();
	}
}