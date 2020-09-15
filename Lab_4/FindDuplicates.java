import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FindDuplicates 
{
	
	private String fileName;
	
	
	public FindDuplicates(String textFile)
	{
		fileName = textFile;
	}
	
	public String getFile()
	{
		return fileName;
	}
	
	public void setFile()
	{
		System.out.println("Enter file name: ");
		Scanner file = new Scanner(System.in);
		fileName = file.nextLine();
	}

	public String getDuplicates()
	{
		String fileLine = "";
		String compInd[] = new String[50];
		int compCount = 0;
		try
		{
			int numTextLines = 0; //will keep track of how many lines the file has
			int expandArray = 100; //adds 100 when "expanding the array"
			File inputFile = new File(fileName);
			Scanner file = new Scanner(inputFile);
			String newCompInd[]; //used for "expanding" the array
			int repeatStopper = 0; //counter to make sure lines don't get repeated
			
			while(file.hasNextLine())
			{
				compInd[numTextLines] = file.nextLine(); 
				numTextLines++;
				if(numTextLines == (compInd.length - 1))
				{
					//makes a temporary array if the original String array is running out of empty indexes
					newCompInd = new String[compInd.length + expandArray];
					for(int i = 0; i < compInd.length; i++)
					{
						newCompInd[i] = compInd[i];
					}
					//alternative: System.arraycopy(compInd, 0, newCompInd, 0, 10);
					compInd = newCompInd; //replaces filled array with new array with empty spaces
					//alternative: compInd = Arrays.copyOf(compInd, compInd.length + expandArray);
				}
			}
			
			String copyCompInd[] = new String[compInd.length]; //array set equal to original array to find duplicates
			for(int i = 0; i < compInd.length; i++)
			{
				copyCompInd[i] = compInd[i];
			}
			
			for(int i = 0; i < compInd.length; i++)
			{
				if(compInd[i] != null)
				{
					String partsOriginal[] = compInd[i].split(" "); //splits string at compInd[i] into parts to extract the keywords
					for(int j = i + 1; j < compInd.length; j++)
					{
						if(copyCompInd[j] != null)
						{
							String partsCopy[] = copyCompInd[j].split(" ");
							if(repeatStopper < 1)
							{
								if(partsOriginal[0].equals(partsCopy[0]))
								{
									System.out.println((j + 1) + " " + compInd[j]);
									repeatStopper++;
								}
							}	
						}
					}
					repeatStopper = 0; //resets repeatStopper
				}
			}
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("Message: " + fnfe.getMessage( ) );
			System.out.println("\ntoString( ): " + fnfe + "\n" );
			fnfe.printStackTrace();
		}
		
		return "";
	}
	
	public String toString()
	{
		return "File name: " + fileName;
	}
	
	

}
