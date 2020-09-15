import java.util.*;
public class BallApp
{

	public static void main(String[] args) throws InputMismatchException
	{
		Scanner myScan = new Scanner(System.in);
		double height = 0;
		int bounces = 0;
		double newBouncePercentage = 0.0; 
		boolean correctDataType = false;
		//sample output with default constructor and user input
		System.out.println("Default Ball Object");
		Ball defaultBall = new Ball();
		System.out.println(defaultBall.toString());
		do
		{
			try
			{
				System.out.println("Enter the initial height: ");
				height = myScan.nextDouble();
				System.out.println("Enter the number of bounces: ");
				bounces = myScan.nextInt();
				
				if((height > 0) || (bounces > 0))
				{
					correctDataType = true;
				}
				
				defaultBall.bounceTable(height, bounces);
			}
			catch(InputMismatchException e)
			{
				String garbage = myScan.nextLine(); //takes invalid data to prevent infinite loop
				System.out.println("You did not enter the correct data type for height/bounces or entered a negative number. Please try again.");
				System.out.println("Enter positive numbers.");
			}
		}while(!correctDataType);
		
		System.out.println();
		correctDataType = false;
		
		do
		{
			try
			{
				System.out.println("Enter the new bounce percentage: ");
				newBouncePercentage = myScan.nextDouble();
				
				if(newBouncePercentage > 0)
				{
					correctDataType = true;
				}
				
				defaultBall.bounceTable(height, bounces);
			}
			catch(InputMismatchException e3)
			{
				String trash = myScan.nextLine();
				System.out.println("The data you entered is not a number due to " + e3 + ". Please try again.");
			}
		}while(!correctDataType);
		System.out.println("Press any key to continue . . .");
	}

}
