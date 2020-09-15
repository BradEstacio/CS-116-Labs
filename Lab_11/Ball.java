
public class Ball
{
	private double DEFAULT_BOUNCE_PERCENTAGE = 0.5;
	private double bouncePercentage;
	
	public Ball()
	{
		bouncePercentage = DEFAULT_BOUNCE_PERCENTAGE;
	}
	
	public Ball(double bouncePercentage)
	{
		this.bouncePercentage = bouncePercentage;
	}
	
	public void setBouncePercentage(double bouncePercentage)
	{
		if((bouncePercentage > 0) && (bouncePercentage < 1))
		{
			this.bouncePercentage = bouncePercentage;
		}
		else
		{
			this.bouncePercentage = DEFAULT_BOUNCE_PERCENTAGE;
		}
	}
	
	public double getBouncePercentage()
	{
		return bouncePercentage;
	}
	
	public void bounceTable(double initialHeight, int bounceCount)
	{
		double height = initialHeight;
		System.out.println("Bounce # \t Height");
		for(int i = 0; i <= bounceCount; i++)
		{
			System.out.println(i + "\t" + height);
			height *= bouncePercentage;
		}
	}
	
	public String toString()
	{
		return "Bounce Percentage: " + bouncePercentage;
	}
}
