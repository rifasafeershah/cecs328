class MergeSort {
  void merge(int array[], int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m;
    
    int Left[] = new int [n1];
    int Right[] = new int [n2];
    
    for (int i = 0; i < n1; ++i){
      Left[i]  = array[l + i];
    }
    
    for (int j = 0; i < n2; ++j){
      Right[j] = array[m + 1 + j];
    }
