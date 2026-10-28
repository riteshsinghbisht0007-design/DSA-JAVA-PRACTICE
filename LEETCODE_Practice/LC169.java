package LEETCODE_Practice;
import java.util.Scanner;
public class LC169 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int [] nums = new int[size];
    for(int i=0; i<size; i++) {
      nums[i] = sc.nextInt();
    }

    for(int i = 0; i<nums.length; i++) {
      int count = 0;
      for(int j=0; j<nums.length; j++) {
        if(nums[i] == nums[j]) {
          count++;
        }
      }
      if(count > nums.length/2) {
        System.out.println(nums[i]);
        break;
      }
    }
  }
}
