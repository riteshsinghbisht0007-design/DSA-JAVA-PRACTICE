package BitManipulation;

public class PracticeQs {
  // Q1

  // what is the value of X^X for any value of x
  public static int getXorX(int x) {
    return x ^ x;
  }

  // qs2 swap two numbers without using 3rd variable
  public static void swap(int a, int b) {
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
     System.out.println("a is: " + a + " b is: " + b);
    
  }

  // qs 3 :- add 1 to an integer using bit manipulation

  public static int addOneTointeger(int n) {
    return n ^  n;
  }
  public static void main(String[] args) {
    // System.out.println(getXorX(2));
    // swap(2, 3);
    System.out.println(addOneTointeger(5));
  }
}
