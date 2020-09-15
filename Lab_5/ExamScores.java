import java.util.Scanner;

public class ExamScores 
{
	private int numExams;
	private double[] examScores;
	private double examAverage;
	private int examsAboveAverage;
	Scanner myScan = new Scanner(System.in);
	
	public ExamScores(int numScores)
	{
		if(numScores < 0)
		{
			numExams = 0;
		}
		numExams = numScores;
	}
	
	public int getNumExams()
	{
		return numExams;
	}
	
	public void setNumExams(int numScores)
	{
		numExams = numScores;
	}
	
	public double getAverage()
	{
		if(numExams == 0)
		{
			return 0;
		}
		return examAverage;
	}
	
	public int getNumExamsAboveAverage()
	{
		return examsAboveAverage;
	}
	
	public void enterAllScores()
	{
		examScores = new double[numExams];
		for(int i = 0; i < numExams; i++)
		{
			System.out.println("Enter score #" + (i + 1) + ": ");
			examScores[i] = myScan.nextDouble();
			if(examScores[i] < 0)
			{
				examScores[i] = 0.0;
			}
		}
	}
	
	public void calculateAverage()
	{
		double total = 0;
		for(int i = 0; i < numExams; i++)
		{
			total += examScores[i];
		}
		examAverage = total / numExams;
	}
	
	public void scoresAboveAverage()
	{
		for(int i = 0; i < numExams; i++)
		{
			if(examScores[i] > examAverage)
			{
				examsAboveAverage++;
			}
		}
	}
	
	public String toString()
	{
		return "The average score is: " + getAverage() + "\n" + "There are " + getNumExamsAboveAverage() + " scores larger than the average.";
	}
}
