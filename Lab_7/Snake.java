
public class Snake extends Animal
{
	public Snake()
	{
		super();
	}
	
	@Override
	public void makeSound()
	{
		System.out.println("I am a Snake. I hiss");
	}
	
	@Override
	public void move()
	{
		System.out.println("I am a Snake. I slither");
	}
}
