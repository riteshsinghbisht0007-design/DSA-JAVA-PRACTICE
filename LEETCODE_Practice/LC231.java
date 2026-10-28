package LEETCODE_Practice;
import java.util.Scanner;
public class LC231 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    while ( n != 1){
      if(n % 2 == 0){
        n = n/2;
      } else {
        System.out.println("false");
        break;
      }

      if (n == 1){
        System.out.println("true");
      }
      
      

    }
    
    
  }
}