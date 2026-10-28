package FunctionInJava;

public class pdt {
  public static int printPdt(int n1, int n2) {
   int prod = n1 * n2;
   return prod;
  }
  public static void main(String[] args) {
  int n1 = 5;
  int n2 = 9;
  int product = printPdt(n1, n2);
  System.out.println(product);
  
  }
}
