package LEETCODE_Practice;
import java.util.Scanner;

public class LC136 {
  public static int singleNumber(int[] nums) {
    // int ans = 0;
    // for (int i = 0; i < nums.length; i++) {
    //   ans ^= nums[i];
    // }
    // return ans;

    for(int i = 0; i < nums.length; i++) {
      int count = 0;
      for(int j = 0; j < nums.length; j++) {
        if(nums[i] == nums[j]) {
          count++;
        }
      }
      if(count == 1) {
        return nums[i];
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] nums = new int[size];

    // input
    for (int i = 0; i < size; i++) {
      nums[i] = sc.nextInt();
    }

    System.out.println(singleNumber(nums));
  }
}
