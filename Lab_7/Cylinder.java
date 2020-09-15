
public class Cylinder extends CircleSolid
{
	private double height;
	
	public Cylinder()
	{
		super();
	}
	
	public Cylinder(double r, double h)
	{
		super(r);
		this.height = (double) h;
	}
	
	public void setHeight(double h)
	{
		this.height = (double) h;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	@Override
	public double getArea()
	{
		return (2 * Math.PI * super.getRadius() * getHeight()) + (2 * Math.PI * Math.pow(super.getRadius(), 2));
	}
	
	@Override
	public double getVolume()
	{
		return Math.PI * Math.pow(super.getRadius(), 2) * getHeight();
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "Cylinder: Height = " + getHeight() + " Volume: " + getVolume();
	}
}
