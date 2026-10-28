package FunctionInJava;
import java.util.*;
public class JavaBasics {

  public static int calcSum(int num1 ,int num2) {// parameters or formal parameters
    
     int sum = num1 + num2;
     return sum;
  }

  public static void swap(int a ,int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.println("a is: " + a);
    System.out.println("b is: " + b);
  }
  public static void printSum(int a ,int b) {
  }
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    //  int a = sc.nextInt();
    //  int b = sc.nextInt();
    //  int sum = calcSum(a, b);// arguments or actual parameters
    //  System.out.println("sum is: "+ sum);
    //  calcSum(a, b);

    // swap

    int a = sc.nextInt();
    int b = sc.nextInt();
    swap(a, b);
  }
}
