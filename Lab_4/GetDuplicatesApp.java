
public class GetDuplicatesApp {

	public static void main(String[] args) 
	{
			FindDuplicates dupe1 = new FindDuplicates("input1.txt");
			dupe1.setFile();
			System.out.println(dupe1.toString());
			System.out.println("DUPLICATES");
			dupe1.getDuplicates();
			System.out.println();
			System.out.println("Press any key to continue...");
	}

}
