package Patterns;
public class One {
  public static void main(String[] args) {
    int n = 4;
    for(int line = n; line>=1; line--){
      for(int star = 1; star<= line; star++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
 