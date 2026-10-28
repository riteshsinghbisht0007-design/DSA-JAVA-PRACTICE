package SyntaxInjava;
import java.util.Scanner;
public class java {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your income : ");
    int income = sc.nextInt();

    if (income < 500000){
      System.out.println("No tax");
      System.out.println("Total income is : " + income);
    }
    else if(income > 500000 && income < 1000000){
      System.out.println("10% tax");
      int tax = (10 * income) / 100;
      int new_income = income - tax;
      System.out.println("Total income is : " + new_income);
    }
    else if(income > 1000000 && income < 2000000){
      System.out.println("20% tax");
      int tax = (20 * income) / 100;
      int new_income2 = income - tax;
      System.out.println("Total income is : " + new_income2);
    }
    else{
      System.out.println("30% tax");
      int tax = (30 * income) / 100;
      int new_income3 = income - tax;
      System.out.println("Total income is : " + new_income3);
    }
  }
}
