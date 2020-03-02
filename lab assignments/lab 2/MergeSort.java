/**
 * This is the MergeSort program that performs the merge sort algorithm on an array of integers.
 * @author Rifa Safeer Shah & Manuel Castro Mirafuentes
 * @date 03 - 01 - 2020
 */

public class MergeSort {
	
	/* Divides the array into subarrays that are then merged */
	void merge(int array[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int left[] = new int [n1];
		int right[] = new int [n2];
		
		/* left section of the main array is stored in left array */
		for(int i = 0; i < n1; i++)
		{
			left[i]  = array[l + i];
		}
		
		/* right section of the main array is stored in the right array */
		for(int j = 0; j < n2; j++)
		{
			right[j] = array[m + 1 + j];
		}
		/*
		int k = l;
		while (i < n1 && j < n2) {
		if (Left[i] <= Right[j]) {
			array[k] = Left[i];
			i++;
		}
		else {
			array[k] = Right[j];
			j++;
		}
		k++;
		*/
		
		// why is this? pls explain
		for(int i = 0; i < n1; i++)
		{
			for (int j = 0; j < n2, j++)
			{
				
			}
		}
		
		int i = 0;
		int j = 0;
		for(int k = p, k < ; k++)
		{
			if(left[i] <= right[j])
			{
				array[k] = left[i];
				i++;
			}
			else
			{
				array[k] = right[j];
				j++;
			}	
		}
	}
	
	/* Insert the rest of the elements from the left array */
	while(i < n1) {
		array[k] = Left[i];
    		i++;
    		k++;
     	}
	
	
	/* Insert the rest of the elements from the right array */
	while (j < n2) {
		array[k] = Right[j];
		j++;
		k++;
	}
	
  	//p is left
  	//q is middle
  	//r is right
	/* Sort the array */
	public void Sort(int array[], int mLeft, int mRight)
	{
		if(mLeft < mRight)
		{
			int mMiddle = (mLeft + mRight) / 2; //Locate the mid point
			Sort(array, mLeft, mMiddle); //Sort the first sectin
			Sort(array, mMiddle + 1, mRight); //Sort the second section
			merge(array, mLeft, mMiddle, mRight); //Merge both the sections
		}
	}
	
	/* Prints the elements of the array */
	public static void printArray(int array[])
	{
		int a = array.length;
		for(int i = 0; i < a; i++)
		{
			System.out.print(array[i] + " ");
		} //Ends for loop
		System.out.println();
	}
	
	public static void main(String args[])
	{
		int[] array = new int [20];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter elements: ");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]);
		} //Ends for loop
		System.out.println("Given Array");
		printArray(array);
		
		MergeSort ms = new MergeSort();
		ms.Sort(array, 0, array.length-1);
		
		System.out.println("\nSorted Array");
		printArray(array);
	} //Ends main
} //Ends MergeSort
