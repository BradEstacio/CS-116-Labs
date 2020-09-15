
public class SupersonicJet extends Vehicle
{
	public SupersonicJet()
	{
		super();
	}
	
	@Override
	public void makeSound()
	{
		System.out.println("I am Supersonic Jet. I create sonic boom");
	}
	
	@Override
	public void move()
	{
		System.out.println("I am Supersonic Jet. I fly");
	}
}
