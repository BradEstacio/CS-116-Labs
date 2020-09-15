import java.util.concurrent.TimeUnit; 
import java.util.*;
public class sortMethods 
{

	public static void main(String[] args) throws InterruptedException //only works for arrays
	{
		//Random random = new Random();
		int totalTime = 0;
		int numTrials = 100; //number of trials being run is known
		int[] testArray = new int[1000]; //size of arrays tested will be of sizes: 1000, 2000, 4000, 8000, and 16,000 random integers
		long startTime = 0;
		long endTime = 0;
		long timeElapsed = 0;
		
		
		for(int i = 0; i < numTrials; i++) //runs through the trials - tested with both insertion sort and binary insertion sort
		{
			for(int j = 0; j < testArray.length; j++) //fills array w/ random ints between -10000 and 10000 - resets for every trial
			{
				testArray[j] = (int) (Math.random() * ((10000 + 10000) + 1)) - 10000;
						//random.nextInt(10000 + 10000) - 10000;
			}
			startTime = System.nanoTime();
			binaryInsertionSort(testArray);
			endTime = System.nanoTime();
			timeElapsed = endTime - startTime;
			totalTime += timeElapsed;
		}
		System.out.println("Average time for all trials in nanoseconds: " + (totalTime /numTrials));
		
		//Trial results for insertion sort: 1000 ints ~ 190000 ns, 2000 ints ~ 520000 ns, 4000 ints ~ 1600000 ns, 8000 ints ~ 5800000 ns, 16000 ints ~ 21000000 ns 
		//Trial results for binary insertion sort: 1000 ints ~ 250000 ns, 2000 ints ~ 590000 ns, 4000 ints ~ 1750000 ns, 8000 ints ~ 6100000 ns, 16000 ints ~ 20000000 ns
	}

	public static void insertionSort(int[] array)
	{
		int j, temp;
		for ( int i = 1; i < array.length; i++ )
		{
			j = i;
			temp = array[i];
			while ( j != 0 && array[j - 1] > temp )
			{
				array[j] = array[j - 1];
				j--;
			}
			array[j] = temp;
		}
		//prints out array at the end
//		for(int i = 0; i < array.length; i++)
//		{
//			System.out.print(array[i] + ", ");
//		}
//		System.out.println();
	}
	
	public static void binaryInsertionSort(int[] array)
	{
		int temp;
		for(int i = 1; i < array.length; i++)
		{
			temp = array[i];
			//start of binary search - finds where to insert array[i]
			int start = 0, end = i;
			while(start < end)
			{
				int middle = (start + end) / 2;
				if(temp < array[middle])
				{
					end = middle; 
				}
				else
				{
					start = middle + 1;
				}
			}
			//shifting elements
			for(int j = i; j > start; j--)
			{
				array[j] = array[j - 1];
			}
			array[start] = temp;
		}
		//prints out array at the end
//		for(int i = 0; i < array.length; i++)
//		{
//			System.out.print(array[i] + ", ");
//		}
//		System.out.println();
	}
	
	
	public static int binarySearch(int [] array, int key)
	{
		int start = 0, end = array.length - 1;
		while ( end >= start )
		{
			int middle = ( start + end ) / 2;
			if ( array[middle] == key )
				return middle; // key found
			else if ( array[middle] > key )
				end = middle - 1; // search left
			else
				start = middle + 1; // search right
	}
		return -1; // key not found
	}
}
