package LEETCODE_Practice;
import java.util.Scanner;
public class LC217 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] nums = new int[n];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
    }

    for(int i = 0; i< nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if (nums [i] == nums[j]){
                    System.out.println(true);
                    return;

                }
            }
        }
       System.out.println(false);
  }
}