import java.util.Scanner;

public class SalesClient 
{

	public static void main(String[] args) 
	{
		Scanner myScan = new Scanner(System.in);
		int daysInMonth;
		int numDaysSales;
		int counter = 0; //counter for the while loop
		int daySaleMade = 0;
		int sales = 0;
		int[] daysBelowGoal;
		
		System.out.println("How many days were in this month? ");
		daysInMonth = myScan.nextInt();
		
		DailySales monthlyReport = new DailySales(daysInMonth);
		
		System.out.println("How many days were sales made in the month? ");
		numDaysSales = myScan.nextInt();
		
		while(counter < numDaysSales)
		{
			System.out.println("Enter the day the sale was made and the number of sales made: ");
			daySaleMade = myScan.nextInt();
			sales = myScan.nextInt();
			monthlyReport.addSales(daySaleMade, sales);
			counter++;
		}
		daysBelowGoal = monthlyReport.daysBelowGoal();
		
		System.out.println("The day that the most amount of sales were made was on day " + monthlyReport.maxDay());
		System.out.println("Here are the days where the goal was not met: ");
		for(int i = 0; i < daysBelowGoal.length; i++)
		{
			if(daysBelowGoal[i] > 0) //makes sure it doesn't print days that sales were made - represent by 0 in the array
			{
				System.out.print(daysBelowGoal[i] + ", ");
			}
		}
	}

}
