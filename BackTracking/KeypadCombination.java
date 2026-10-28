package BackTracking;

public class KeypadCombination {
  public static void keypad(String str, String ans) {
    
    // base case 
    if(str.length() == 0) {
      System.out.println(ans);
      return;
    }
    

    // recursion 
    char ch = str.charAt(0);
    String ros = str.substring(1);
    String codeForCh = "";
    switch(ch) {
      case '2': codeForCh = "abc"; break;
      case '3': codeForCh = "def"; break;
      case '4': codeForCh = "ghi"; break;
      case '5': codeForCh = "jkl"; break;
      case '6': codeForCh = "mno"; break;
      case '7': codeForCh = "pqrs"; break;
      case '8': codeForCh = "tuv"; break;
      case '9': codeForCh = "wxyz"; break;
    }
    for(int i=0; i<codeForCh.length(); i++) {
      keypad(ros, ans+codeForCh.charAt(i));
    }

    // no choice
    keypad(ros, ans);

    // backtrack



  }
  public static void main(String[] args) {
    String str = "";
    keypad(str, "");
  }
}
