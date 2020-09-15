
public class Zoning 
{
	private int length;
	private int width;
	private int AREA;
	private double ZONE_PERCENT;
	private int HEIGHT_LIMIT;
	
	public Zoning()
	{
		length = 0;
		width = 0;
	}
	
	public Zoning(int l, int w)
	{
		length = l;
		width = w;
	}
	
	
	public int getLength()
	{
		return length;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getArea()
	{
		AREA = length * width;
		return AREA;
	}
	
	public void setLength(int l)
	{
		if(l >= 0)
		{
			length = l;
		}
		else
		{
			length = 0;
		}
	}
	
	public void setWidth(int w)
	{
		if(w >= 0)
		{
			width = w;
		}
		else
		{
			width = 0;
		}
	}
	
	public double heightLimit()
	{
		if(getArea() <= 2000)
		{
			return 25.0;
		}
		
		else if(((getArea() > 2000) && (getArea() <= 2500)))
		{
			double perc = ((getArea() - 2000) * 0.02);
			return (25 + perc);
		}
		
		else if(((getArea() > 2500) && (getArea() <= 3500)))
		{
			double perc = ((getArea() - 2500) * 0.01);
			return (35 + perc);
		}
		else if(((getArea() > 3500) && (getArea() <= 5000)))
		{
			double perc = ((getArea() - 3500) * 0.005);
			return (45 + perc);
		}
		else
		{
			double perc = ((getArea() - 5000) * 0.0025);
			return (52.5 + perc);
		}
	}
		
	public int unitCountLimit()
	{
		if(getArea() <= 2000)
		{
			return 1;
		}
		else if(((getArea() > 2000) && (getArea() <= 2500)))
		{
			return 2;
		}
		
		else if(((getArea() > 2500) && (getArea() <= 3500)))
		{
			return 3;
		}
		else if(((getArea() > 3500) && (getArea() <= 5000)))
		{
			return 4;
		}
		else
		{
			return 5;
		}
	}
		
		public String toString()
		{
			return "Length: " + getLength() + ", Width: " + getWidth() + ", Area: " + getArea() + ", Height limit: " + heightLimit() + ", Unit count limit: " + unitCountLimit();
		}
	
}
