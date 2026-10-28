package OOPS;

public class MethodOverLoading {
  public static void main(String[] args) {
    Calculator cal = new Calculator();
    System.out.println(cal.sum(10, 20));
    System.out.println(cal.sum(10.5f, 20.5f)); 
  }
}

class Calculator{
  int sum (int a, int b){
    return a+b;
  }  
  float sum(float a, float b){
    return a+b;
  }

  int sum (int a, int b, int c){
    return a+b+c;
  }


}