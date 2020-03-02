class MergeSort {
  void merge(int array[], int left, int middle, int right) {
    int p1 = middle - left + 1;
    int p2 = right - middle;
    
    int Left[] = new int [p1];
    int Right[] = new int [p2];
    
    for (int i = 0; i < p1; ++i){
      Left[i]  = array[left + i];
    }
    
    for (int j = 0; i < p2; ++j){
      Right[j] = array[middle + 1 + j];
    }
    
    int i = 0;
    int j = 0;
    
    int k = left;
    while(i < p1 && j < p2) {
      if (Left[i]
