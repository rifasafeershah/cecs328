/**
 * @author Rifa Safeer Shah & Manuel Castro Mirafuentes
 * @date 03 - 01 - 2020
 */


public class MergeSort
{
	int count;
	
	public void Merge(int array[], int l, int m, int r)
	{
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int left[] = new int [n1];
		int right[] = new int [n2];
		
		for(int i = 0; i < n1; i++)
		{
			left[i]  = array[l + i];
		}
		
		for(int j = 0; j < n2; j++)
		{
			right[j] = array[m + 1 + j];
		}
		
		for(int k = l; k < r; k++)
		{
			for(int i = 0; i < n1; i++)
			{
				for(int j = 0; j < n2; j++)
				{
					count++;
					if(left[i] <= right[j]);
					{
						array[k] = left[i];
					}
					else
					{
						array[k] = right[j];
					}
				}
			}
		}
		
		for(int k = l; k < r; k++)
		{
			for(int i = 0; i < n1; i++)
			{
				array[k] = left[i];
			}
			for(int j = 0; j < n2; j++)
			{
				array[k] = right[j];
			}
		}
	}
  
  	//p is left
  	//q is middle
  	//r is right
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
	
	public static void printArray(int array[])
	{
		int a = array.length;
		for(int i = 0; i < a; i++)
		{
			System.out.print(array[i] + " ");
		}	
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
		System.out.println("\nUnsorted Array");
		printArray(array);
		
		MergeSort ms = new MergeSort();
		m.Count = 0;
		ms.Sort(array, 0, array.length - 1);
		
		System.out.println("\nSorted Array");
		printArray(array);
		
		System.out.println("\nNumber of Comparisions:" + m.Count);
	} //Ends main
} //Ends MergeSort