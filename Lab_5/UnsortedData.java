import java.util.Scanner;

public class UnsortedData 
{
	private String file;
	
	public UnsortedData(String inputFile)
	{
		file = inputFile;
	}
	
	public static int countOutOfPosistion(double[] numList)
	{
		int unsortedCounter = 0;
		for(int i = 0; i < numList.length; i++)
		{
			for(int j = i + 1; j < numList.length; j++)
			{
				if(numList[i] > numList[j])
				{
					unsortedCounter++;
				}
			}
		}
		return unsortedCounter;
	}
	
	public static void bubble(double[] numList)
	{
		double temp1 = 0.0;
		double temp2 = 0.0;
		//temp doubles made in order to help sort out the array
		for(int i = 0; i < numList.length - 1; i++)
		{
			if(numList[i] > numList[i +1])
			{
				temp1 = numList[i];
				temp2 = numList[i + 1];
				numList[i] = temp2;
				numList[i + 1] = temp1;
			}
		}
	}
}
