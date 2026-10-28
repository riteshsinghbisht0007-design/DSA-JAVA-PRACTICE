package FunctionInJava;

public class FactorialOfNum {
  public static int fact(int n) {
    int f = 1;
    for(int i =1; i<=n; i++){
      f = f * i;
    }
    return f; //  factorial of n 
  }
 public static int binCoeff(int n, int r) {
   int factN = fact(n); // factorial of n
   int factR = fact(r); // factorial of r
   int factNR = fact(n-r); // factorial of n-r
   return factN / (factR * factNR);
 }

 // fun to calculate sum of two number 
//  public static int sum(int a, int b) {
//    return a + b;
//  }

//  // fun to calculate sum of three number
//  public static int sum(int a, int b, int c) {
//    return a + b + c;
//  }

 // func to cal int sum
 public static int sum(int a, int b) {
   return a + b;
 }

 // func to cal float sum
 public static float sum(float a, float b) {
   return a + b;
 }
  public static void main(String[] args) {
    System.out.println(sum(5,9));
    System.out.println(sum(5.5f, 9.5f));
  }
}
