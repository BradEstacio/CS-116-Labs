
public class SwitchPlayer extends Player implements PlayerInterface
{
	@Override
	public int selectDoor()
	{
		int randGuess = (int) (Math.random() * 3.0) + 1;
		this.selectedDoor = randGuess;
		return this.selectedDoor;
	}
	
	@Override
	public int selectDoorAgain(int openDoor)
	{
		if(openDoor == 1) 
		{
			if(this.selectedDoor == 2)
			{
				this.selectedDoor = 3;
				return 3;
			}
			else
			{
				this.selectedDoor = 2;
				return 2;
			}
		}
		else if(openDoor == 2) 
		{
			if(this.selectedDoor == 1)
			{
				this.selectedDoor = 3;
				return 3;
			}
			else
			{
				this.selectedDoor = 1;
				return 1;
			}
		}
		else
		{
			if(this.selectedDoor == 2)
			{
				this.selectedDoor = 1;
				return 1;
			}
			else
			{
				this.selectedDoor = 2;
				return 2;
			}
		}
	}
}
