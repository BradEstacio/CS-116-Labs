import java.util.Scanner;
public class Craps 
{

	public static void main(String[] args) 
	{
		Scanner myScan = new Scanner(System.in);
		
		Die dice1 = new Die();
		Die dice2 = new Die();
		int roll1;
		int roll2;
		int result;
		int target;
		int numOfRolls = 0;
		
		dice1.roll();
		dice2.roll();
		roll1 = dice1.getSide();
		roll2 = dice2.getSide();
		
		target = roll1 + roll2;
		
		System.out.println("Target roll: " + roll1 + " + " + roll2 + " = " + target);
		
		do
		{
			dice1.roll();
			dice2.roll();
			roll1 = dice1.getSide();
			roll2 = dice2.getSide();
			
			result = roll1 + roll2;
			
			if(target == 7)
			{
				System.out.println("You won on the first roll!");
				break;
			}
			
			System.out.println("You rolled: " + roll1 + " + " + roll2 + " = " + result);
			numOfRolls++;
			
		}while((result != 7) && (result != target) && (target != 7));
		
		if((result == target) && (numOfRolls >= 1))
		{
			System.out.println("You rolled your target");
		}
		if((numOfRolls >= 1) && (result == 7))
		{
			System.out.println("CRAPS! You lost.");
		}
		
		System.out.println("Press any key to continue...");
	}

}
