
public class OrderRepeat extends OrderNoRepeat
{
	private int period;	
	private Date endDate;

	public OrderRepeat(String orderType, String customerID, String productID, String date, int amount ,int period, String endDate)
	{
		super(orderType, customerID, productID, date, amount);
		
		this.period = period;
		String[] splitDate = endDate.split("/");
		String[] splitEndDate = endDate.split("/");
		
		Date makeEndDate;
		if(Integer.parseInt(splitDate[0]) > Integer.parseInt(splitEndDate[0]) || Integer.parseInt(splitDate[1]) > Integer.parseInt(splitEndDate[1]) || Integer.parseInt(splitDate[2]) > Integer.parseInt(splitEndDate[2]))
		{
			super.setDate(endDate);
			makeEndDate = new Date(Integer.parseInt(splitDate[0]), Integer.parseInt(splitDate[1]), Integer.parseInt(splitDate[2]));
			this.endDate = makeEndDate;
		}
		else
		{
			makeEndDate = new Date(Integer.parseInt(splitEndDate[0]), Integer.parseInt(splitEndDate[1]), Integer.parseInt(splitEndDate[2]));
			this.endDate = makeEndDate;
		}
//		Date makeEndDate = new Date(Integer.parseInt(splitEndDate[0]), Integer.parseInt(splitEndDate[1]), Integer.parseInt(splitEndDate[2]));
//		this.endDate = makeEndDate;
	}

	public int getPeriod() 
	{
		return period;
	}

	public void setPeriod(int period) 
	{
		if(period < 0)
		{
			System.out.println("Invalid period enetered. Setting period equal to 1.");
			this.period = 1;
		}
		else	
		{
			this.period = period;
		}
	}

	public Date getEndDate() 
	{
		Date endDateCopy = new Date(this.endDate.getDay(), this.endDate.getMonth(), this.endDate.getYear());
		return endDateCopy;
	}

	public void setEndDate(String endDate) 
	{
		String[] splitEndDate = endDate.split("/");
		Date makeEndDate = new Date(Integer.parseInt(splitEndDate[0]), Integer.parseInt(splitEndDate[1]), Integer.parseInt(splitEndDate[2]));
		this.endDate = makeEndDate;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + ", # of days between repeats: " + getPeriod() + ", End date for repeated orders: " + getEndDate();
	}
}
