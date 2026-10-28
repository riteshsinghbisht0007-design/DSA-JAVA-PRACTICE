package Sorting;
import java.lang.reflect.*;
import java.util.*;

public class BasicSelectionSort {
  public static void selectionSort(Integer arr[]){
    for(int i=0; i<arr.length-1; i++){
      int minPos = i;
      for(int j = i+1; j<arr.length; j++){
        if(arr[minPos] > arr[j]){
          minPos = j;
        }
      }

      // swap 
      int temp = arr[minPos];
      arr[minPos] = arr[i];
      arr[i] = temp;
      
    }
  }
   public static void printArray(Integer arr[]){
    int n = arr.length;
    for(int i = 0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Integer arr[] = {7, 5, 3, -1, 2, 4, 6, -8, 9};
    // selectionSort(arr);

    // inbuilt sort
    // Arrays.sort(arr, 0, 4);

    // Collections.sort(arr);
    Array.(arr, 0, arr.length, Collection.());
    printArray(arr);
  }
}
