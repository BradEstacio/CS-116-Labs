
public class CommonElements {
	public static void main(String[] args) 
	{
		RandomIntegerArrayCreator arrayA = new RandomIntegerArrayCreator();
		RandomIntegerArrayCreator arrayB = new RandomIntegerArrayCreator();
		//converting RandomIntegerArrayCreator objects into arrays
		int[] arA = arrayA.getArray();
		int[] arB = arrayB.getArray();
		//counters for common ints in arrays/common integer in the array
		int commonA;
		int commonB;
		int countA = 0;
		int countB = 0;
		//counter used for comparing when A and B share same ints
		int commonAandBcounter = 0;
		//keeps track of how many times an integer from 0 to 10 (represented by the indexes) appears
		int[] elements = new int[11];
		//how many times each element appears in the array
		int[] numTimesAppearsA = new int[16];
		int[] numTimesAppearsB = new int[16];
		
		System.out.print("Array A: ");
		for(int i = 0 ; i < arA.length; i ++)
		{
			System.out.print(arA[i] + "    ");
		}
		System.out.println();
		
		System.out.print("Array B: ");
		for(int i = 0 ; i < arB.length; i ++)
		{
			System.out.print(arB[i] + "    ");
		}

		//array loop runs through itself to find if there are duplicate integers and keeps track of how many times they appear
		for(int i = 0; i < arrayA.getArraySize(); i++)
		{
			numTimesAppearsA[arA[i]]++;
			for(int f = 0; f < arrayA.getArraySize(); f++)	
			if(arA[i] == arA[f])
			{
				countA++;
				commonA = arA[i];
				
				if((countA > 1) && (arA[f] == commonA) )
				{
					countA++;
					arA[i] = -1; //once a common integer is found, its set to -1 to prevent error in counting
				}
			}
			
			countA = 0;
		}
		System.out.println();
		//this is the same code for array A but running through B and setting common numbers equal to 16
		for(int i = 0; i < arrayB.getArraySize(); i++)
		{
			numTimesAppearsB[arB[i]]++;
			for(int f = 0; f < arrayB.getArraySize(); f++)	
			if(arB[i] == arB[f])
			{
				countB++;
				commonB = arB[i];
				
				if((countB > 1) && (arB[f] == commonB) )
				{
					countB++;
					arB[i] = 16;		
				}
				countB = 0;	//counters are reset			
			}
		}
		System.out.println("Element:   # in A:     # in B:");
		for(int i = 0; i < elements.length; i++)
		{
			if((numTimesAppearsA[i] > 0) || (numTimesAppearsB[i] > 0)) //prints out line if either integer appears more than once
			{
				System.out.println(i  + "               " + numTimesAppearsA[i] + "            " + numTimesAppearsB[i]);
			}
		}
		
		for(int i = 0; i < elements.length; i++) 
		{
			if((numTimesAppearsA[i] > 0) && (numTimesAppearsB[i] > 0)) //if both have an the same integer appearing more than once this runs
			{
				commonAandBcounter++;
			}
		}
		System.out.println("Number of common elements in A and B: " + commonAandBcounter);
		
	}

}
