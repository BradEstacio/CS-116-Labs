
public class SquareRoot {

	public static void main(String[] args) 
	{
		System.out.println(findSquareRoot(1.0 , 0.001));
		System.out.println(findSquareRoot(81.0, 0.000000001));
		System.out.println(findSquareRoot(4.0, 0.01));
		System.out.println(findSquareRoot(400.0, 0.1));
	}
	
	public static double findSquareRoot(double a, double t)
	{
		int n = 0;
		double squareRoot = 0.0;
		while(Math.abs(Math.pow(squareRoot, 2) - a) >= t)
		{
			n++;
			squareRoot = X(n, a);
		}
		return squareRoot;
	}
	
	public static double X(int n, double a)
	{
		if(n == 0)
		{
			return .5 * a;
		}
		else
		{
			return .5 * (X(n - 1, a) + (a / X(n - 1, a)));
		}
	}
	
}
