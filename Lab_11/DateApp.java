import java.util.*;
public class DateApp {

	public static void main(String[] args) 
	{
		Scanner myScan = new Scanner(System.in);
		
		int month = 1;
		int day = 1;
		int year = 2000;
		
		Date dateTest = new Date(); 
		while(true) //while loop to continuously test user input
		{
			System.out.println("Enter a month: ");
			month = myScan.nextInt();
			System.out.println("Enter a day: ");
			day = myScan.nextInt();
			System.out.println("Enter a year: ");
			year = myScan.nextInt();
			myScan.nextLine(); //clears out line
			
			dateTest.setDate(month, day, year);
			
			System.out.println(dateTest.toString());
			System.out.println();

			System.out.println("Enter 'X' to stop testing...");
			if(myScan.nextLine().equals("X"))
			{
				break;
			}
		}
	}

}
