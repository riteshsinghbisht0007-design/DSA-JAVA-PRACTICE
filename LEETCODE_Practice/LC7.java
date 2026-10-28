package LEETCODE_Practice;
import java.util.Scanner;
public class LC7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int rev = 0;
    if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
      System.out.println(0);
      return;
    }
    
    while (n != 0) {
      int rem = n % 10;
      rev = rev * 10 + rem;
      n = n / 10;
    }
    System.out.println(rev);
    
  }
}