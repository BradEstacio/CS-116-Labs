
public class Vector 
{
	private int initialPointX;
	private int initialPointY;
	private int terminalPointX;
	private int terminalPointY;
	
	public Vector()
	{
		initialPointX = 0;
		initialPointY = 0;
		terminalPointX = 0;
		terminalPointY = 0;
	}
	
	public Vector(int x, int y)
	{
		initialPointX = 0;
		initialPointY = 0;
		terminalPointX = x;
		terminalPointY = y;
	}
	
	public int getStartPointX()
	{
		return initialPointX;
	}
	
	public int getStartPointY()
	{
		return initialPointY;
	}
	
	public int getEndPointX()
	{
		return terminalPointX;
	}
	
	public int getEndPointY()
	{
		return terminalPointY;
	}
	
}
