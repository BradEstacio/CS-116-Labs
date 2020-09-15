
public class RandomSwitchPlayer extends Player implements PlayerInterface
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
		int random = 0;
        if(openDoor == 1) 
        {
            random = (int) (Math.random() * 2.0) + 2;
            this.selectedDoor = random;
            return this.selectedDoor;
        }
        else if(openDoor == 2)
        {
            random = (int) (Math.random() * 2.0) + 1;
            if(random == 1)
            {
                this.selectedDoor = 1;
                return 1;
            }
            else
            {
                this.selectedDoor = 3;
                return 3;
            }
        }
        else //open door == 3
        {
            random = (int) (Math.random() * 2.0) + 1;
            this.selectedDoor = random;
            return random;
        }
	}
}
