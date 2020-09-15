
public class Sphere extends CircleSolid
{
	public Sphere()
	{
		super();
	}
	
	public Sphere(double r)
	{
		super(r);
	}
	
	@Override
	public double getArea()
	{
		return 4 * Math.PI * Math.pow(super.getRadius(), 2);
	}
	
	public double getVolume()
	{
		return (4.0/3.0) * Math.PI * Math.pow(super.getRadius(), 3);
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "Sphere: Volume = " + getVolume();
	}
}
