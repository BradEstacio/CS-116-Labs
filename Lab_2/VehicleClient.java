import java.util.Scanner;

public class VehicleClient {

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		Vehicle vehicle1 = new Vehicle(700);
		System.out.println("Time arrived at booth?");
		int timeArrived1 = userInput.nextInt();
		vehicle1.setBoothTime(timeArrived1);
		System.out.println("Time leaving booth?");
		int timeLeaving1 = userInput.nextInt();
		vehicle1.setTimeLeaving(timeLeaving1);
		System.out.println(vehicle1.toString());
		
		Vehicle vehicle2 = new Vehicle(835);
		System.out.println("Time arrived at booth?");
		int timeArrived2 = userInput.nextInt();
		vehicle2.setBoothTime(timeArrived2);
		System.out.println(vehicle2.toString());
		
		System.out.println();
		Vehicle vehicle3 = new Vehicle(925);
		System.out.println(vehicle3.toString());
		
		Vehicle vehicle4 = new Vehicle(1045);
		System.out.println("Time leaving booth?");
		int timeLeaving4 = userInput.nextInt();
		vehicle4.setTimeLeaving(timeLeaving4);
		System.out.println(vehicle4.toString());

	}

}
