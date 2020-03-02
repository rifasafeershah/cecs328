class MergeSort {
  void merge(int array[], int p, int q, int r) {
    int n1 = q - p + 1;
    int n2 = r - q;
    
    int left[] = new int [n1];
    int right[] = new int [n2];
    
    for (int i = 0; i < n1; i++){
      left[i]  = array[p + i];
    }
    
    for (int j = 0; j < n2; j++){
      right[j] = array[q + 1 + j];
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
  
     
