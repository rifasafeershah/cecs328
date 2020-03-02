/**
 * @author Rifa Safeer Shah & Manuel Castro Mirafuentes
 * @date 03 - 01 - 2020
 */


class MergeSort {
<<<<<<< HEAD
  void merge(int array[], int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m;
    
    int left[] = new int [n1];
    int right[] = new int [n2];
    
    for(int i = 0; i < n1; i++){
      left[i]  = array[l + i];
    }
    
    for(int j = 0; j < n2; j++){
      right[j] = array[m + 1 + j];
    }
    
    for(int i = 0; i < n1; i++)
    {
    	for (int j = 0; j < n2, j++)
    	{
    		
    	}
     int i = 0;
     int j = 0;
     for(int k = p, k < p; k++)
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
     
     while(i < n1)
     {
    	 array[k] = Left[i];
    	 i++;
    	 k++;
     }
  }
  
  //p is left
  //q is middle
  //r is right
  void Sort(int array[], int mLeft, int mRight)
  {
	  if(mLeft < mRight)
	  {
		  int mMiddle = (mLeft + mRight) / 2;
		  Sort(array, mLeft, mMiddle);
		  Sort(array, mMiddle + 1, mRight);
		  Sort(array, mLeft, mMiddle, mRight);
	  }
  }
  
  static void printArray(int array[])
  {
	  int a = array.length;
	  for(int i = 0; i < a; i++)
	  {
		  System.out.print(array[i] + " ");
	  }
  }
}

  public static void main(String args[]) {
    int[] array = new int [20];
    Scanner input = new Scanner(System.in);
    System.out.println("Enter elements: ");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
    } //Ends for loop
    System.out.println("Given Array");
    printArray(array);
    
    MergeSort ms = new MergeSort();
    ms.sort(array, 0, array.length-1);
    
    System.out.println("\nSorted Array");
    printArray(array);
  } //Ends main
} //Ends MergeSort