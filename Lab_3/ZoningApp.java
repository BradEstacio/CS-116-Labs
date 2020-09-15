import java.util.Scanner;
public class ZoningApp 
{

	public static void main(String[] args) 
	{
		Scanner myScan = new Scanner(System.in);
		
		Zoning zoneTest = new Zoning();
		System.out.println("Enter a length: ");
		int length = myScan.nextInt();
		zoneTest.setLength(length);
		System.out.println("Enter  width: ");
		int width = myScan.nextInt();
		zoneTest.setWidth(width);
		
		System.out.println(zoneTest.toString());
	}

}
