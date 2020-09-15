
public class Car extends Vehicle
{
	public Car()
	{
		super();
	}
	
	@Override
	public void makeSound()
	{
		System.out.println("I am Car. I honk");
	}
	
	@Override
	public void move()
	{
		System.out.println("I am Car. I drive");
	}
}
