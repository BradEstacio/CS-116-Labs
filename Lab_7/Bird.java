
public class Bird extends Animal
{
	public Bird()
	{
		super();
	}
	
	@Override
	public void makeSound()
	{
		System.out.println("I am a Bird. I chirp");
	}
	
	@Override
	public void move()
	{
		System.out.println("I am a Bird. I fly");
	}
}
