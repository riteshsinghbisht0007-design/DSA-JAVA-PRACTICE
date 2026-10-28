package SyntaxInjava;
import java.util.Scanner;
public class Qs {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int sumOfeven = 0;
  int sumOfodd = 0;
  // input
    
    for(int i = 1; i <= n; i++) {
     int input = sc.nextInt();

     if (input % 2 == 0) {
       sumOfeven = sumOfeven + input;
     } else {
       sumOfodd = sumOfodd + input;
     }
    }
    System.out.println("total sum of even number is " + sumOfeven + " and total sum of odd number is "  + sumOfodd);

     
    
  }
}
