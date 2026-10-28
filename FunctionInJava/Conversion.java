package FunctionInJava;

public class Conversion {

  public static void binToDec(int binNum){
    int myNum = binNum;
    int pow = 0, decNum = 0;

    while(binNum > 0){
      int lastDigit = binNum % 10;
      decNum = decNum + (lastDigit *(int) Math.pow(2, pow));
      pow++;
      binNum = binNum / 10;
    }
    System.out.println("decimal of "+myNum+" is "+decNum);
  }

  public static void DecToBin(int decNum){
    int myNum = decNum;
    int pow = 0, binNum = 0;

    while(decNum > 0){
      int lastDigit = decNum % 2;
      binNum = binNum + (lastDigit *(int) Math.pow(10, pow));
      pow++;
      decNum = decNum / 2;
    }
    System.out.println("binary of "+myNum+" is "+binNum); 
  }
   public static void main(String[] args) {
    DecToBin(15);
   }
}
