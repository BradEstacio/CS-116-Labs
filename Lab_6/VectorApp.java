
public class VectorApp {

	public static void main(String[] args) 
	{
		Vector riseGamer = new Vector(30, 30); //base test case
		BoundVector oppressGamer = new BoundVector(31, 31); //subclass case with only terminal points
		Vector whatsUpGamer = new BoundVector(30, 30, 31, 31); //subclass with initial and terminal points using polymorphism
		
		System.out.println("riseGamer terminal points: x = " + riseGamer.getEndPointX() + ", y = " + riseGamer.getEndPointY());
		System.out.println("riseGamer initial points: x = " + riseGamer.getStartPointX() + ", y = " + riseGamer.getStartPointY());
		System.out.println("oppressGamer terminal points: x = " + oppressGamer.getEndPointX() + ", y = " + oppressGamer.getEndPointY());
		System.out.println("oppressGamer initial points: x = " + oppressGamer.getStartPointX() + ", y = " + oppressGamer.getStartPointY());
		System.out.println("whatsUpGamer terminal points: x = " + whatsUpGamer.getEndPointX() + ", y = " + whatsUpGamer.getEndPointY());
		System.out.println("whatsUpGamer initial points: x = " + whatsUpGamer.getStartPointX() + ", y = " + whatsUpGamer.getStartPointY());
	}

}
