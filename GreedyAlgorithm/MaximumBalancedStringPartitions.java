package GreedyAlgorithm;
import java.util.Scanner;
public class MaximumBalancedStringPartitions {
  public static int maximumBalancedStringPartitions(String str) {
    int balance = 0;
    int n = str.length();
    int count = 0;
    // for random string 
    for (int i = 0; i < n; i++) {
      balance += (str.charAt(i) == 'a' ? 1 : -1);
      if (balance == 0) {
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str = new java.util.Scanner(System.in).nextLine();
    System.out.println(maximumBalancedStringPartitions(str));
  }
}
