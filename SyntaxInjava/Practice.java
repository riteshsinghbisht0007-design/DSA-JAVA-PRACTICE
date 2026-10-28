package SyntaxInjava;
import java.util.Scanner;
public class Practice {
  public static boolean isPalindrome(int num) {
    int originalNum = num;
    int reversedNum = 0;
    
    while (num > 0) {
      int digit = num % 10;
      reversedNum = reversedNum * 10 + digit;
      num /= 10;
    }
    
    return originalNum == reversedNum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    System.out.println("Is " + num + " a palindrome? " + isPalindrome(num));
  }
}
