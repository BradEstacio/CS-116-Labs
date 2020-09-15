
public abstract class CircleSolid 
{
	private double radius;
	
	public CircleSolid()
	{
		this.radius = (double) 0;
	}
	
	public CircleSolid(double r)
	{
		this.radius = (double) r;
	}
	
	public void setRadius(double r)
	{
		this.radius = (double) r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getCircumference()
	{
		return 2 * Math.PI * radius;
	}
	
	public double getArea()
	{
		return 2 * Math.PI * Math.pow(radius, 2);
	}
	
	public abstract double getVolume();
	
	public String toString()
	{
		return "Circle Solid: Radius = " + getRadius() + "\n";
	}
}
