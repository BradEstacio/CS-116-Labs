import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class UnsortedDataApp 
{
	public static void main(String[] args) 
	{
		String fileName = "";
		double[] numList = new double[100];
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("What is the name of the file input? ");
		fileName = myScan.nextLine();
		
		File inputFile = new File(fileName);
		Scanner file;
		try 
		{
			file = new Scanner(inputFile);
			UnsortedData data = new UnsortedData(fileName);
			
			for(int i = 0; i < numList.length; i++)
			{
				numList[i] = file.nextDouble();
			}
			System.out.println("Total out order BEFORE bubble: " + data.countOutOfPosistion(numList));
			data.bubble(numList);
			System.out.println("Total out of order AFTER bubble: " + data.countOutOfPosistion(numList));

		} 
		catch (FileNotFoundException fnfe) 
		{

			fnfe.printStackTrace();
		}
	}

}