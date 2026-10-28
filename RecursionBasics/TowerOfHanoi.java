package RecursionBasics;

public class TowerOfHanoi {
  static void Hanoi(int n, char A, char B, char C) {
    if(n == 0){
      return;
    }

    Hanoi(n-1, A, C, B);
    System.out.println("Move " + n + " from " + A + " to " + C);
    Hanoi(n-1, B, A, C);

  }
  public static void main(String[] args) {
    int n = 3;
   Hanoi(n, 'a', 'b', 'c');
  }
}
