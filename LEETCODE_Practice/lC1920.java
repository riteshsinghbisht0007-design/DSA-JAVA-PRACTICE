package LEETCODE_Practice;
import java.util.Scanner;
public class lC1920 {
  public static void main(int [] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] nums = new int[size];


    // input
    for(int i = 0; i < size; i++) {
      nums[i] = sc.nextInt();
    }

int ans [] = new int[nums.length];
    // int sum = nums[0];
    for(int i = 1; i < nums.length; i++) {
      ans[i] = nums[nums[i]];
    }
    for(int i = 0; i <= size-1 ; i++) {
      System.out.print(ans[i] + " ");
    }

  }
}
