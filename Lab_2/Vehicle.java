
public class Vehicle 
{
	private int vehicleID, arrivalTime, timeAtBooth, timeLeaving;
	
	private static int numOfVehicles;
	
	public Vehicle(int arrTime)
	{
		
		  arrivalTime = arrTime;
		  vehicleID = (int)(Math.random() * 10000);
		  timeAtBooth = 0;
		  timeLeaving = 0;
		  
	}
	
	public int getArrivalTime()
	{
		return arrivalTime;
	}
	
	public int getTimeLeaving()
	{
		return timeLeaving;
	}
	
	public int getBoothTime()
	{
		return timeAtBooth;
	}
	
	public int getVehicleID()
	{
		return vehicleID;
	}
	
	public void setTimeLeaving(int lt)
	{
		if(getArrivalTime() < lt && lt > 0)
		{
			timeLeaving = lt;
		}
		else
		{
			timeLeaving = 0;
		}
	}
	
	public void setBoothTime(int bt)
	{
		if(getArrivalTime() <= bt && bt > 0)
		{
			timeAtBooth = bt;
		}
		else
		{
			timeAtBooth = 0;
		}
	}
	
	public String toString()
	{
		String str = "Vehicle ID: " + getVehicleID() + ", Arrival time: " + getArrivalTime() + ", Time vehicle gets to toll booth: " + getBoothTime() + ", Time leaving booth: " + getTimeLeaving();
		return str;
	}
	
	
	
}

