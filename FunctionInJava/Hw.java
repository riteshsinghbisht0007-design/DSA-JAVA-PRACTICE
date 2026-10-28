package FunctionInJava;

public class Hw {
 public static boolean checkPalindrone(int n) {
   int rev = 0, temp = n;
   while (n != 0) {
     int rem = n % 10;
     rev = rev * 10 + rem;
     n = n / 10;
   }
   if (temp == rev) {
     return true;
   } else {
     return false;
   }
 }
  public static void main(String[] args) {
    System.out.println(checkPalindrone(1211));
  }
}



