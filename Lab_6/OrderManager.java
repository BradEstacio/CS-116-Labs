import java.util.ArrayList;

public class OrderManager
{
	private OrderNoRepeat order;
	private OrderRepeat orderRepeat;
	private ArrayList<OrderNoRepeat> orders = new ArrayList<OrderNoRepeat>(); 
	private ArrayList<Integer> orderIDs = new ArrayList<Integer>();
	private int numID;

	public OrderManager()
	{
		super();
		numID = 0;
	}
	
	public OrderManager(OrderNoRepeat order) //for orders that don't repeat
	{
		super();
		if(order.getOrderType().equals("O"))
		{
			this.order = order;
			orders.add(order);
			numID = 1;
			orderIDs.add(numID);
		}
	}
	
	public OrderManager(OrderRepeat order) //for orders that do repeat
	{
		super();
		if(order.getOrderType().equals("R"))
		{
			this.orderRepeat = order;
			orders.add(order);
			numID = 1;
			orderIDs.add(numID);
		}
	}
	
	public int getOrderID(OrderNoRepeat order)
	{
		if(orders.indexOf(order) == -1)
		{
			System.out.println("The order has been removed or does not exist");
			return -1;
		}
		return orderIDs.get(orders.indexOf(order));
	}
	
	public void setOrder(OrderNoRepeat order)
	{
		OrderNoRepeat copyOrder = new OrderNoRepeat(order.getOrderType(), order.getCustomerID(), order.getProductID(), order.getDate().toString(), order.getAmount());
		this.order = copyOrder;
	}
	
	public void setOrder(OrderRepeat order)
	{
		OrderRepeat copyOrder = new OrderRepeat(order.getOrderType(), order.getCustomerID(), order.getProductID(), order.toString(), order.getAmount(), order.getPeriod(), order.getEndDate().toString());
		this.orderRepeat = copyOrder;
	}
	
	public void addOrder(OrderNoRepeat newOrder)
	{
		numID++;
		orderIDs.add(numID);
		orders.add(newOrder);
	}
	
	public void addOrder(OrderRepeat newOrder)
	{
		numID++;
		orderIDs.add(numID);
		orders.add(newOrder);
	}
	
	public void removeOrder(int orderID)
	{
		for(int i = 0; i < orderIDs.size(); i++)
		{
			if(orderID == orderIDs.get(i))
			{
				orders.remove(i);
				orderIDs.remove(i);
			}
		}
	}
	
	public void listAllOrders(int year, int month)
	{
		for(int i = 0; i < orders.size(); i++)
		{
			if((orders.get(i).getMonth() == month) && (orders.get(i).getYear() == year))
			{
				System.out.println(getOrderID(orders.get(i)) +  orders.get(i).toString());
			}
		}
	}
	
	public void listAllOrders(Date startDate, Date endDate)
	{
		for(int i = 0; i < orders.size(); i++)
		{
			if(orders.get(i).equals(startDate))
			{
				if(orders.get(i) instanceof OrderRepeat)
				{	
					for(int j = 0; j < ((OrderRepeat)orders.get(i)).getPeriod(); j++)
					{
						System.out.println(getOrderID(orders.get(i)) +  orders.get(i).toString());
					}
				}
				System.out.println(getOrderID(orders.get(i)) +  orders.get(i).toString());
			}
		}
	}
	
	public void listAllOrders(String productID)
	{
		for(int i = 0; i < orders.size(); i++)
		{
			if((orders.get(i).getProductID().equals(productID)))
			{
				System.out.println(getOrderID(orders.get(i)) +  orders.get(i).toString());
			}
		}
	}
	
	public double sumAmount(int year, int month)
	{
		double sum = 0.0;
		
		for(int i = 0; i < orders.size(); i++)
		{
			if((orders.get(i).getMonth() == month) && (orders.get(i).getYear() == year))
			{
				sum += (double) orders.get(i).getAmount();
			}
		}
		
		return sum;
	}
	
	public double sumAmount(Date startDate, Date endDate)
	{
		double sum = 0.0;
		
		for(int i = 0; i < orders.size(); i++)
		{

			if(orders.get(i).equals(startDate))
			{
				if(orders.get(i) instanceof OrderRepeat)
				{	
					for(int j = 0; j < ((OrderRepeat)orders.get(i)).getPeriod(); j++)
					{
						sum += ((OrderRepeat)orders.get(i)).getPeriod() * orders.get(i).getAmount();
					}
				}
				sum += (double) orders.get(i).getAmount();
			}
		}
		
		return sum;
	}
	
	public double sumAmount(String productID)
	{
		double sum = 0.0;
		
		for(int i = 0; i < orders.size(); i++)
		{
			if((orders.get(i).getProductID().equals(productID)))
			{
				sum += (double) orders.get(i).getAmount();
			}
		}
		
		return sum;
	}
	
	public String toString()
	{
		String allOrders = "";
		for(int i = 0; i < orders.size(); i++)
		{
			allOrders += "Order ID: " + getOrderID(orders.get(i)) +  orders.get(i).toString() + "\n";
		}
		return allOrders;
	}
}
