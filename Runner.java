public class Runner implements PerfectSquare
{
	public Runner()
	{

	}

	public boolean checkPerfect(int num)
	{
		int x = (int)(Math.sqrt(num));
		return (x*x == num);
	}

	public static void main(String[]args)
	{

	}
}