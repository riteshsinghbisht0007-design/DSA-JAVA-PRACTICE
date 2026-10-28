package Patterns;
import java.util.Scanner;

public class CharPrint {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =  sc.nextInt(); 
    char ch = 'A';
    for(int line = 1; line<=n; line++){
      for(int star = 1; star<=line; star++){
        System.out.print(ch);
        ch++; 
      }
      System.out.println();
    }
  }
}
