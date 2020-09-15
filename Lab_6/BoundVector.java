
public class BoundVector extends Vector 
{
	private int initialPointX;
	private int initialPointY;
	
	
	public BoundVector() 
	{
		super();
	}
	
	public BoundVector(int terminalX, int terminalY)
	{
		super(terminalX, terminalY);
	}
	
	public BoundVector(int initialX, int initialY, int terminalX, int terminalY)
	{
		super(terminalX, terminalY);
		this.initialPointX = initialX;
		this.initialPointY = initialY;
	}
	
	@Override
	public int getStartPointX()
	{
		return this.initialPointX;
	}
	
	@Override
	public int getStartPointY()
	{
		return this.initialPointY;
	}
	
	@Override
	public int getEndPointX()
	{
		return super.getEndPointX();
	}
	
	@Override
	public int getEndPointY()
	{
		return super.getEndPointY();
	}
}
