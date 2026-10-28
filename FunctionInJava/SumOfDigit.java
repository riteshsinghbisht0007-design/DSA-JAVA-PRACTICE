    Package FunctionInJava;
public class SumOfDigit{
  public static int sum(int n) {
    int sum = 0;
    while (n != 0) {
      int rem = n % 10;
      sum = sum + rem;
      n = n / 10;
    }
    return sum;
  }
  public static void main(String[] args) {
    sum(123);
  }
}

    void main() {
    }