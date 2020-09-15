import java.util.Scanner;

public class ExamClient 
{
	public static void main(String[] args) 
	{
		int numScores;
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("How many scores do you have to enter? ");
		numScores = myScan.nextInt();
		
		ExamScores exam1 = new ExamScores(numScores);
		
		exam1.enterAllScores();
		exam1.calculateAverage();
		exam1.scoresAboveAverage();
		
		System.out.println(exam1.toString());

	}
}
