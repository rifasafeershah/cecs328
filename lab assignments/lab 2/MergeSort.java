/**
 * This is the MergeSort program that performs the merge sort algorithm on an array of integers.
 * @author Rifa Safeer Shah & Manuel Castro Mirafuentes
 * @date 03 - 01 - 2020
 */

import java.util.*;

public class MergeSort
{
	int count;
	
	/* Divides the array into subarrays that are then merged */
	public void Merge(int array[], int l, int m, int r)
	{
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
		
		int i = 0;
		int j = 0;
		
		for(int k = l; k < r; k++) {
			count++;
			if(left[i] <= right[j]) {
				array[k] = left[i];
				i++;
			}
			else {
				array[k] = right[j];
				j++;
			}
		}
	}
	
	public void mergeSort(int array[], int mLeft, int mRight)
	{
		if(mLeft < mRight)
		{
			int mMiddle = (mLeft + mRight) / 2;
			mergeSort(array, mLeft, mMiddle);
			mergeSort(array, mMiddle + 1, mRight);
			Merge(array, mLeft, mMiddle, mRight);
		}
	}
	
	/* Prints the elements of the array */
	public static void printArray(int array[])
	{
		int a = array.length;
		for(int i = 0; i < a; i++) {
			System.out.print(array[i] + " ");
		} //Ends for loop
	}
	
	public static void main(String args[]) {
		int[] array = new int [20];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter elements: ");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]);
		} //Ends for loop
		System.out.println("\nUnsorted Array");
		printArray(array);
		
		MergeSort ms = new MergeSort();
		ms.count = 0;
		ms.mergeSort(array, 0, array.length - 1);
		
		System.out.println("\nSorted Array");
		printArray(array);
		
		System.out.println("\nNumber of Comparisions:" + ms.count);
	} //Ends main
} //Ends MergeSort
