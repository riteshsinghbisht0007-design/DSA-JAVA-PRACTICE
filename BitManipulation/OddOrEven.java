package BitManipulation;

public class OddOrEven {
  public static void checkOddOrEven(int num) {
    int bitMask = 1;
    if ((num & bitMask) == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }

  public static int getIth(int num, int ith) {
    int bitMask = 1;
    if((num & bitMask) == 0) {
      return 0;
    } else {
      return 1;
    }                
  }

  public static int setIth(int num, int ith) {
    int bitMask = 1;
    return num | (bitMask << ith);
  }

  public static int clearIth(int num, int ith) {
    int bitMask = 1;
    return num & ~(bitMask << ith);
  }

  public static int updateIth(int num, int ith, int value) {
    // if (value == 0) {
    //   return clearIth(num, ith);
    // } else {
    //   return setIth(num, ith);
    // }

    num = clearIth(num, ith);
    int bitMask = value << ith;
    return num | bitMask;

  }

  public static int clearIBitsInRange(int n, int i, int j ){
    int a = (~0) << (j+1); 
    int b = (1 << i) - 1; 
    return n & (a | b);
  }
  public static int clearLastIth(int num, int ith) {
    int bitMask = (~0) << ith;
    return num &  bitMask;
  }
  public static void main(String[] args) {
    // checkOddOrEven(10);
    // checkOddOrEven(11);
     
    // System.out.println(getIth(10, 1));
    // System.out.println(setIth(10, 2));

    // System.out.println(clearIth(10, 1));

    // System.out.println(updateIth(10, 1, 1));

    // System.out.println(clearLastIth(15, 2));4

    System.out.println(clearIBitsInRange(15, 2, 4) );
  }
}
