
public class RandomIntegerArrayCreator 
{
	private int[] randArray;
	
	public RandomIntegerArrayCreator()
	{
		int arraySize = (int) (Math.random() * 16);
		randArray = new int[arraySize];
		for(int i = 0; i < arraySize; i++)
		{
			randArray[i] = (int) (Math.random() * 11);
		}
	}
	
	public int getArraySize()
	{
		return randArray.length;
	}
	
	public int[] getArray()
	{
		return randArray;
	}
}
