package RecursionBasics;

public class PrintXPowN {
  public static int printXPown(int x, int n) {
    // Time Complexity = O(n)
    // if (n == 0) {
    //   return 1;
    // }
    // return x * printXPown(x, n - 1);

    // Optimized Soln TC = O(logn)
    if (n == 0) {
      return 1;
    }
    if (n % 2 == 0) {
      return printXPown(x, n / 2) * printXPown(x, n / 2);
    } else {
      return x * printXPown(x, n / 2) * printXPown(x, n / 2);
    } 

    // int halfPower = printXPown(x, n / 2);
    // if (n % 2 == 0) {
    //   return halfPower * halfPower;
    // } else {
    //   return x * halfPower * halfPower;
    // }
  }
  public static void main(String[] args) {
    int x = 2, n = 5;
    System.out.println(printXPown(x, n));
  }
}
 