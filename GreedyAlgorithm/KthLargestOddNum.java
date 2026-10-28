package GreedyAlgorithm;
import java.util.*;


public class KthLargestOddNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter starting index: ");
    int L = sc.nextInt();

    System.out.println("Enter ending index: ");
    int R = sc.nextInt();

    System.out.println("Enter value of kth largest: ");
    int k = sc.nextInt();

    int arr[] = new int[R-L+1];
    int index = 0;
    for(int i=L; i<=R; i++) {
      if(i % 2 != 0) {
        arr[index] = i;
        index++;
      } 
    }

    for(int i=0; i<index; i++) {
      System.out.print(arr[i] + " ");
    }

    if(index < k) {
      System.out.println("Not Possible");
      return;
    }
    System.out.println();

    Arrays.sort(arr,0,index);
    System.out.println("Kth largest odd number is: ");
    System.out.println(arr[index - k]);

  }
}
