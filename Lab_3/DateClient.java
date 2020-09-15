import java.util.Scanner;
public class DateClient
{
  public static void main( String [] args )
  {
     // add code to construct Data objects
	 // and test and output if they are a
	 // leap year or not
	  Scanner myScan = new Scanner(System.in);
	  
	  System.out.println("Enter a month: ");
	  int month = myScan.nextInt();
	  System.out.println("Enter a day: ");
	  int day = myScan.nextInt();
	  System.out.println("Enter a year: ");
	  int year = myScan.nextInt();
	  
	  Date dateTest = new Date(month, day, year);
	  System.out.println(dateTest.getYear() + " is a leap year? " + dateTest.isALeapYear(dateTest.getYear()));
	  System.out.println(dateTest.toString());
	 
	 // not leap year (not divisible by 4)
	  
	  //Date date1 = new Date(6, 4, 2001);
	  //System.out.println(date1.getYear() + " leap year? " + date1.isALeapYear(date1.getYear()));

	 // leap year (divisible by 4, but not by 100)
	  //Date date2 = new Date(3, 6, 2004);
	  //System.out.println(date2.getYear() + " leap year? " + date2.isALeapYear(date2.getYear()));
	  
	 // not leap year (divisible by 4 and by 100)
	  //Date date3 = new Date(6, 9, 1900);
	  //System.out.println(date3.getYear() + " leap year? " + date3.isALeapYear(date3.getYear()));

	 // leap year (divisible by 4 and by 100 and by 400)
	  //Date date4 = new Date(4, 20, 2400);
	  //System.out.println(date4.getYear() + " leap year? " + date4.isALeapYear(date4.getYear()));

	 // your birth year
	  //Date birthday = new Date(4, 30, 2001);
	  //System.out.println(birthday.getYear() + " leap year? " + birthday.isALeapYear(birthday.getYear()));
	  
	  //Date date5 = new Date(2, 1, -100);
	  //System.out.println(date5.toString());
	  
	  //Date date6 = new Date(2, 29, 2006);
	  //System.out.println(date6.toString());
	  
	  //Date date7 = new Date(2, 29, 2000);
	  //System.out.println(date7.toString());
	  
	  //Date date8 = new Date(2, 29, 2004);
	  //System.out.println(date8.toString());
	  
	  //Date date9 = new Date(2, 29, 1900);
	  //System.out.println(date9.toString());
	  
	  //Date date10 = new Date(2, 29, 1600);
	  //System.out.println(date10.toString());
  }
}

