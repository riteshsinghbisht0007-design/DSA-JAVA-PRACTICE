package Sorting;

public class BasicBubbleSort {
  public static void bubbleSort(int arr[]){
    int n = arr.length;
    int count = 0;
    for(int i = 0; i < n-1; i++){
      for(int j =0; j<n-i-1; j++){
        if(arr[j] > arr[j+1]){

          // swapping 
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          count++;
        }
        }
      }
        if (count == 0){
          System.out.println("Array is already sorted");
          return;
        }
    System.out.println("Number of swaps: " + count);
  }
  public static void printArray(int arr[]){
    int n = arr.length;
    for(int i = 0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,8,9};
    bubbleSort(arr);
    printArray(arr);
  }
}
