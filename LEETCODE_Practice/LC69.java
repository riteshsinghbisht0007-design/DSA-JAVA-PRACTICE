package LEETCODE_Practice;
import java.util.Scanner;
public class LC69 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();

    // without Math.sqrt(n) 
    double result = 0.0;
    for (int i = 1; i <= n; i++) {
      result += 1.0 / i;
    }
    System.out.println(result);
  }
}
