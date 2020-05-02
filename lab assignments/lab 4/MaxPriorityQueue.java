/**
 * Assignment 4: Max Priority Queue
 * @author Manuel Castro-Mirafuentes, Rifa Safeer Shah 
 * CECS 328 SPRING 2020
 */

import java.lang.Math;
import java.util.Scanner;

public class MaxPriorityQueue
{
	public static int log2(int x)
	{
		return (int) (Math.log(x)/Math.log(2));
	}
	
	public static int getParent(int i)
	{
		return (int) Math.floor(log2(i));
	}
	
	public static int getLeft(int i)
	{
		return (2 * i) + 1;
	}
	
	public static int getRight(int i)
	{
		return (2 * i) + 2;
	}
	
	public static void maxHeapify(int a[], int i)
	{
		int left = getLeft(i); //left
		int right = getRight(i); //right
		int largest = i; //largest index
		/* largest is left if left child is larger than root */
		if(left < a.length && a[left] > a[i])
		{
			largest = left;
		} // Ends if-statement
		/* else largest is the root */
		else
		{
			largest = i;
		} // Ends else
		/* largest is right if right child is larger than root */
		if(right < a.length && a[right] > a[largest])
		{
			largest = right;
		}
		/* if root is not the largest */
		if(largest != i)
		{
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			maxHeapify(a, largest);
		} // Ends if-statement
	} // End of maxHeapify
	
	public static void buildMaxHeap(int a[], int length)
	{
		for(int i = (length / 2) - 1; i >= 0; i--)
		{
			maxHeapify(a, i);
		}
	}			
	
	
	public static int heapMaximum(int a[])
	{
		return a[0]; //return root of binary tree
	} // End of heapMaximum
	
	/**
	 * removes the maximum
	 * @param a is the array
	 * @return maximum
	 */
	public static int heapExtractMax(int a[])
	{
		if(a.length < 1)
		{
			System.out.print("\nERROR: Heap underflow\n\n");
		}
		int max = a[0];
		a[0] = a[a.length - 1];
		int[] temp = new int[a.length - 1];
		temp[0] = max;
		for(int i = 1; i < a.length - 1; i++)
		{
			temp[i] = a[i];
		}
		int[] x = temp;
		//a = temp;
		maxHeapify(x, 0);
		return max;
	} // End of heapExtractMax
	
	/**
	 * increases key
	 * @param a
	 * @param i
	 * @param key
	 */
	public static void heapIncreaseKey(int a[], int i, int key)
	{
		i--;
		if(key < a[i])
		{
			System.out.print("\nERROR: new key is smaller than current key\n");
		}
		else
		{
			a[i] = key;
	//		int p = getParent(i);
	//		while(i > 0 && a[p] < a[i])
	//		{
	//			int temp = a[i];
	//			a[i] = a[p];
	//			a[p] = temp;
	//			i = getParent(i);
	//		}
			buildMaxHeap(a, a.length);
			list = a;
		}
	}
	
	/**
	 * Inserts new node in the binary tree
	 * @param a is the array
	 * @param key
	 */
	public static void maxHeapInsert(int a[], int key)
	{
		int[] temp = new int[a.length + 1];
		for(int i = 0; i < a.length; i++)
		{
			temp[i] = a[i];
		}
		temp[a.length] = -100;
		int x[] = temp;
		heapIncreaseKey(x, x.length, key);
	}
	
	/**
	 * prints the elements of the array
	 * @param a is the array of elements
	 * @param length of the array
	 */
	public static void print(int a[], int length)
	{
		System.out.print("\nOutputted Max Heap: ");
		for(int i = 0; i < length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.print("\n");
	}

	public static void main(String[] args)
	{
		list = new int[args.length];
		for(int index = 0; index < args.length; index++)
		{
			list[index] = Integer.parseInt(args[index]);
		}
		System.out.print("Input an array of integers separated by spaces: " + list);
		System.out.println();
		buildMaxHeap(list, list.length);
		print(list, list.length);
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		boolean next = true;
		while(next)
		{
			System.out.print("\nChoose from the following options:\n\n");
			System.out.print("\t1. Insert\n");
			System.out.print("\t2. Maximum\n");
			System.out.print("\t3. Extract Max\n");
			System.out.print("\t4. Increase Key\n");
			System.out.print("\t5. Exit\n\n");
			int choice = in.nextInt();
			switch(choice)
			{
			case 1:
				/* Insert */
				System.out.print("\nInput the integer you want inserted: ");
				int key = in.nextInt();
				maxHeapInsert(list, key);
				print(list, list.length);
				break;
			case 2:
				/* Maximum */
				System.out.print("\nMaximum value is: ");
				int max1 = heapMaximum(list);
				System.out.print(max1 + "\n");
				break;
			case 3:
				/* Extract Max */
				System.out.print("\nMaximum value is: ");
				int max2 = heapExtractMax(list);
				System.out.print(max2 + "\n");
				print(list, list.length);
				break;
			case 4:
				/* Increase Key */
				System.out.print("\nInput the index of the node you want to increase: ");
				int index = in.nextInt();
				System.out.print("\nInput the new value: ");
				int value = in.nextInt();
				heapIncreaseKey(list, index, value);
				print(list, list.length);
				break;
			case 5:
				/* Exit */
				next = false;
				break;
			default:
				break;
			}
		}
	}
	public static int[] list;
}
