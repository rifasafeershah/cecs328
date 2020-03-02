/**
 * @author Rifa Safeer Shah & Manuel Castro Mirafuentes
 * @date 03 - 01 - 2020
 */


class MergeSort {
  void merge(int array[], int left, int middle, int right) {
    int p1 = middle - left + 1;
    int p2 = right - middle;
    
    int Left[] = new int [p1];
    int Right[] = new int [p2];
    
    for (int i = 0; i < p1; ++i) {
      Left[i]  = array[left + i];
    } //Ends for loop
    
    for (int j = 0; i < p2; ++j) {
      Right[j] = array[middle + 1 + j];
    } //Ends for loop
    
    int i = 0;
    int j = 0;
    
    int k = left;
    //while(i < p1 && j < p2) {
      //if (Left[i]
  } //Ends merge
  
  void sort() {
    
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
