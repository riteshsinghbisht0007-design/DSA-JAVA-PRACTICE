package RecursionBasics;

public class BinStrings {
  public static void printBinStrings(int n, int lastPlace, String ans) {

    // Base case 
    if (n == 0) {
      System.out.println(ans);
      return;
    }
    
    // kaam

    printBinStrings(n-1, 0, ans+"0");
    if(lastPlace == 0){
    printBinStrings(n-1, 1, ans+"1");
  }
  }
  public static void main(String[] args) {
    printBinStrings(3, 0, "");
  }
}
