public class OrderNoRepeat extends OrderManager
{
	private String orderType;
	private String customerID;
	private String productID;
	private Date date;
	private int amount;
	
	public OrderNoRepeat(String orderType, String customerID, String productID, String date, int amount)
	{	
		super();
		this.orderType = orderType;
		this.customerID = customerID;
		this.productID = productID;
		//splitting date string and parsing into ints to be used for the date object
		String[] splitDate = date.split("/");
		Date makeDate = new Date(Integer.parseInt(splitDate[0]), Integer.parseInt(splitDate[1]), Integer.parseInt(splitDate[2]));
		this.date = makeDate;
		if(amount < 0)
		{
			this.amount = Math.abs(amount);
		}
		else
		{
			this.amount = amount;
		}
	}
	
	public String getOrderType()
	{
		return orderType;
	}
	
	public String getCustomerID()
	{
		return customerID;
	}
	
	public String getProductID()
	{
		return productID;
	}
	
	public Date getDate()
	{
		Date dateCopy = new Date(this.date.getDay(), this.date.getMonth(), this.date.getYear());
		return dateCopy;
	}
	
	public int getAmount()
	{
		return amount;
	}
	
	public void setOrderType(String orderType) 
	{
		this.orderType = orderType;
	}

	public void setCustomerID(String customerID) 
	{
		this.customerID = customerID;
	}

	public void setProductID(String productID) 
	{
		this.productID = productID;
	}

	public void setDate(String date) 
	{
		String[] splitDate = date.split("/");
		Date makeDate = new Date(Integer.parseInt(splitDate[0]), Integer.parseInt(splitDate[1]), Integer.parseInt(splitDate[2]));
		this.date = makeDate;
	}

	public void setAmount(int amount) 
	{
		if(amount < 0)
		{
			System.out.println("Invalid number entered. Amount order set to one.");
			this.amount = 1;
		}
		else
		{
			this.amount = amount;
		}
	}
	@Override
	public String toString()
	{
		return ", Order type: " + getOrderType() + ", Customer ID: " + getCustomerID() + ", Product ID: " + getProductID() + ", Date ordered: " + this.date.toString() + ", Amount: " + getAmount();
	}
}
