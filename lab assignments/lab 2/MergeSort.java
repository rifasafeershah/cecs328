package cecs328assignment2;
/**
 * This is the MergeSort program that performs the merge sort algorithm on an array of integers.
 * @author Rifa Safeer Shah & Manuel Castro Mirafuentes
 * @date 03 - 01 - 2020
 */
import java.util.*;
public class MergeSort {
	int count;
	/* Divides the array into subarrays that are then merged */
	public static void Merge(int array[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int left[] = new int [n1];
		int right[] = new int [n2];
		/* left section of the main array is stored in left array */
		for(int i = 0; i < n1; i++) {
			left[i]  = array[l + i];
		}
		/* right section of the main array is stored in the right array */
		for(int j = 0; j < n2; j++) {
			right[j] = array[m + 1 + j];
		}
		int i = 0;
		int j = 0;
		int k = l;

		while (i < n1 && j < n2)
		{
			//count the no of comparisons
			count++;
			if (left[i] <= right[j])
			{
				array[k] = left[i];
				i++;
			}
			else
			{
				array[k] = right[j];
				j++;
			}
			k++;
		}

		//Copy remaining elements
		while (i < n1)
		{
			array[k] = left[i];
			i++;
			k++;
		}
		
		//Copy remaining elements
		while (j < n2)
		{
			array[k] = right[j];
			j++;
			k++;
		}
	}
	
	/* Merge the sections */
	public static void mergeSort(int array[], int mLeft, int mRight) {
		if(mLeft < mRight) {
			int mMiddle = (mLeft + mRight) / 2;
			mergeSort(array, mLeft, mMiddle);
			mergeSort(array, mMiddle + 1, mRight);
			Merge(array, mLeft, mMiddle, mRight);
		}
	}
	
	/* Prints the elements of the array */
	public static void printArray(int array[]) {
		int a = array.length;
		for(int i = 0; i < a; i++) {
			System.out.print(array[i] + " ");
		} //Ends for loop
	}//Ends printArray
	
	/* Main runner */
	public static void main(String args[]) {
		int[] array = new int [args.length];
		for (int i = 0; i < args.length; i++) {
			array[i] = Integer.parseInt(args[i]);
		} //Ends for loop
		System.out.println("Unsorted array: ");
		printArray(array); //prints unsorted
		System.out.println("\nSorted array: ");
		mergeSort(array, 0, array.length - 1); //calls mergeSort
		printArray(array); //prints sorted array
		System.out.println("\nNumber of comparisons: " + count);
	} //Ends main
} //Ends MergeSort
