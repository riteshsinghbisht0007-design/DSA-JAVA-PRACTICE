package QueuesInJava;
import java.awt.image.SampleModel;
import java.util.*;

public class MaxOflAllSubArrayOfSizeK {


  // Brute Force ............. T.C = O(n*k)
  public static int getMax(int arr[], int n, int k) {
    for(int i=0; i<=n-k; i++) {
      int max = arr[i];
      for(int j=1; j<k; j++) {
        if(arr[i+j] > max) {
          max = arr[i+j];
        }
      }
      System.out.print(max + " ");
    }
    return 0;
  }


  // Using Queue ............. T.C = O(n)
  public static int getMax(int arr[], int n, int k) {
    Queue<Integer> q = new LinkedList<>();
    Queue q = new Queue(k);

    for(int i=0; i<k; i++) {
      q.add(arr[i]);
    }
    for(int i=k; i<n; i++) {
      System.out.print(q.getMax() + " ");
      q.remove();
      q.add(arr[i]);
    }
    System.out.print(q.getMax() + " ");
    return 0;
  }
  public static void main(String[] args) {
    int arr[] = {1,2,3,1,4,5,2,3,6};
    int n = arr.length;
    int k = 3;

    getMax(arr, n, k);
  }
}
