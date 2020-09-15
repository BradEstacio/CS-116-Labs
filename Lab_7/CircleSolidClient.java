
public class CircleSolidClient 
{

	public static void main(String[] args) 
	{
		CircleSolid cylinder = new Cylinder(28.0, 35.0);
		Sphere sphere = new Sphere(6.0);
		Cylinder cylinder2 = new Cylinder(10.0, 15.0);
		CircleSolid sphere2 = new Sphere(22.0);
		
		System.out.println(cylinder.toString());
		System.out.println();
		System.out.println(sphere.toString());
		System.out.println();
		
		double spheresInCylinder = (cylinder.getVolume() / sphere.getVolume());
		
		System.out.println("Approximate number of spheres in this cylinder = " + spheresInCylinder);
		System.out.println();
		
		System.out.println(cylinder.toString());
		System.out.println();
		System.out.println(sphere.toString());
		System.out.println();
		
		System.out.println("class Sphere Radius = " + sphere.getRadius() + " Volume = " + sphere.getVolume());
		System.out.println("class Sphere Cylinder = " + cylinder2.getRadius() + " Volume = " + cylinder2.getVolume());
		System.out.println("class Sphere Radius = " + sphere2.getRadius() + " Volume = " + sphere2.getVolume());
	}

}
