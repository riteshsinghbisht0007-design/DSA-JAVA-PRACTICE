package LEETCODE_Practice;
import java.util.Scanner;
public class LC1470 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] nums = new int[size];
    int n = size/2;

    // input
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    for(int i=1; i<=n; i++) {
      nums[i] = nums[n-i+1];
    }
    System.out.println(nums[nums.length-1]);
  }
}