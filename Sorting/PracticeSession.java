package Sorting;

public class PracticeSession {
  public static void BubbleSorting(int[] arr) {
    int n = arr.length;
    for(int i=0; i<n-1; i++){
      for(int j=0; j<n-i-1; j++){
        
        if(arr[j] < arr[j+1]){
          // swappppp
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;

        }
      }
    }
    
      
  }
  public static void SelectionSorting(int[] arr) {
    int n = arr.length;
    for(int i = 0; i<n-1; i++){
      int mx = i;
      for(int j = i+1; j<n; j++){
        if(arr[mx] < arr[j]){
          mx = j;
        }
      }
          // swap
          int temp = arr[mx];
      arr[mx] = arr[i];
      arr[i] = temp;
        }
      
    }
  
  public static void printArray(int arr[]){
    int n = arr.length;
    for(int i = 0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int [] arr = {5,7,8,9,12,16};
    SelectionSorting(arr);
    printArray(arr);
  }
}