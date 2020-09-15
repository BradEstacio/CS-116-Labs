
public class NoSwitchPlayer extends Player implements PlayerInterface
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
		return this.selectedDoor;
	}
}
