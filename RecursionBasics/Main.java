package RecursionBasics;

public class Main {
  public static void printDec(int n){

    if (n == 0){
      return;
    }
    System.out.println(n + " ");
    printDec(n-1);

    // Output 
    // 10 9 8 7 6 5 4 3 2 1
  }
  public static void printInc(int n){

    if (n == 0){
      return;
    }
    printInc(n-1);
    System.out.println(n + " ");

    // Output 
    // 1 2 3 4 5  6 7 8 9 10
  }
  public static int fact(int n){

    if (n == 0){
      return 1;
    }
    return n * fact(n-1);
  }
  public static int printSum(int n){ 

    if (n ==1){
      return 1;
    }
    return n + printSum(n-1);
    
    // Time Complexity = O(n)
    // Space Complexity = O(n)
  }

  public static int printFibo(int n){
    // Nth fibonacci number

    if(n == 1 || n == 2){
      return 1;
    }
    return printFibo(n-1) + printFibo(n-2);
  }
  public static void main(String[] args) {
    int n = 15;
    System.out.println(printFibo(n));

  }
}
