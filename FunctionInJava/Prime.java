package FunctionInJava;

public class Prime {
  public static boolean isPrime(int n) {
if (n  == 2){
   return true;
}

    boolean isPrime = true;
    for(int i = 2; i<=Math.sqrt(n); i++) {
      if(n%i == 0) { // completely dividing
        return false;
      }
    }
    return isPrime;
  }

  public static void primeInRanges(int n ){
    for(int i =2; i<=n; i++) {
      if(isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }
  public static void main(String[] args) {
    primeInRanges(190);
  } 
}
