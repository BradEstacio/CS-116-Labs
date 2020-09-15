
public class DailySales 
{
	private int days;
	private int[] numSales;
	
	public DailySales()
	{
		days = 0;
	}
	
	public DailySales(int daysInMonth)
	{
		if(daysInMonth > 31)
		{
			days = 31;
		}
		days = daysInMonth;
		numSales = new int[days];
	}
	
	public boolean addSales(int dayNumber, int sales)
	{
		if((sales < 0) || (dayNumber <= 0))
		{
			return false;
		}
		else
		{
			numSales[dayNumber - 1] += sales;
			return true;
		}
	}
	
	public int maxDay()
	{
		int max = 0;
		int day = 0;
		for(int i = 0; i < numSales.length; i++)
		{
			if(numSales[i] > max)
			{
				max = numSales[i];//sets new max to how many sales were sold on that day
				day = i + 1; //i + 1 for the day because array indexes start at 0
			}
		}
		return day;
	}
	
	public int[] daysBelowGoal()
	{
		int[] belowGoal = new int[days];
		
		for(int i = 0; i < days; i++)//loop finds number of days that sold less than 100 units
		{
			if(numSales[i] < 100) //days that sold above the goal are automatically at 0
			{
				belowGoal[i] = i + 1;
			}
		}
		
		return belowGoal;
	}
}
