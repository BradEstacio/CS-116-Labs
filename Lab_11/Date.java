public class Date 
{
	  private int month;
	  private int day;
	  private int year;

	  /** default constructor
	  *  sets month to 1, day to 1 and year to 2000
	  */
	  public Date()   
	  {
		  setDate(1, 1, 2000);
	  }

	  /** overloaded constructor
	  *  @param mm    initial value for month
	  *  @param dd    initial value for day
	  *  @param yyyy  initial value for year
	  *
	  *  passes parameters to setDate method
	  */
	  public Date(int mm, int dd, int yyyy)   
	  {
		  setDate(mm, dd, yyyy);
	  }

	  /* accessor methods */
	  int getMonth() 
	  { 
		  return month; 
	  }
	  
	  int getDay()   
	  { 
		  return day; 
	  }
	  
	  int getYear()  
	  { 
		  return year; 
	  }

	  /** mutator method */
	  /** setDate
	  *  @param mm    new value for month
	  *  @param dd    new value for day
	  *  @param yyyy  new value for year
	  *  passes parameters to setMonth, setDay, and setYear
	  */
	  public void setDate(int mm, int dd, int yyyy)   
	  {	  
		  try
		  {
			  setYear(yyyy);
			  setMonth(mm);
			  setDay(dd);
		  }
		  catch(DateInvalidException e)
		  {
			  System.out.println("Test threw a " + e.getClass() + " exception");
			  System.out.println("with message: " + e.getMessage());
		  }
	  }
	  
	  /** helper methods */  
	  /** setDay
	  *  @param dd new value for day
	  *  if dd is legal day for current month, sets day to dd
	  *  otherwise, sets day to 1
	  */
	  private void setDay(int dd) throws DateInvalidException
	  {
	    int [] validDays = { 0,  31, 29, 31, 30,
	                         31, 30, 31, 31, 30,
	                         31, 30, 31 };
	    
	    if((dd < 1) || (dd > 31) || (!isALeapYear(getYear()) && (dd == 29) && (getMonth() == 2))) //throws exceptions for invalid leap year date too
	    {
	    	throw new DateInvalidException("Invalid integer was enetered.");
	    }
	    day = ( dd >= 1 && dd <= validDays[month] ? dd : 1 );
	  } 
	  /** setMonth
	  *  @param mm new value for month
	  *  if mm is between 1 and 12, sets month to mm
	  *  otherwise, sets month to 1
	  */
	  private void setMonth(int mm) throws DateInvalidException
	  {
	    if((mm < 1) || (mm > 12))
	    {
	    	throw new DateInvalidException("Invalid integer was entered.");
	    }
	    else
	    {
	    	month = (mm >= 1 && mm <= 12 ? mm : 1);
	    }
	  }
	  /** setYear
	  *  @param yyyy new value for year
	  *  sets year to yyyy
	  */
	  private void setYear(int yyyy) throws DateInvalidException
	  {
	    if(yyyy < 0)
	    {
	    	throw new DateInvalidException("Invalid integer was entered.");
	    }
	    else
	    {
		  year = yyyy;
	    }
	  }
		
	  /** toString
	  *  @return String
	  *  returns date in mm/dd/yyyy format
	  */
	  public String toString() 
	  {
	    return month + "/" + day + "/" + year;
	  }

	  /** equals
	  *  @param   d  Date object to compare to this
	  *  @return  true if d is equal to this
	  *           false, otherwise
	  */
	  public boolean equals(Date d) 
	  {
	    if ( month == d.month
	         && day == d.day
	         && year == d.year )
	      return true;
	    else
	      return false;
	  }
	  
	  public boolean isALeapYear(int yr)
	  {
		  if(yr % 4 == 0)
		  {
			  if((yr % 100 == 0))
			  {
				  if((yr % 400) == 0)
				  {
					  return true;
				  }
				  return false;
			  }
			  return true;
		  }
		  else
		  {
			  return false;
		  }
	  }
} 
