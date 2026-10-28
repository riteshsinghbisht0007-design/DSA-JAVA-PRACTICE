package BackTracking;

public class Permutation {
  public static void findPermutation(String str, String ans) {
    
      // base case 
      if(str.length() == 0) {
        System.out.println(ans);
        return;
      } 

      // recursion 
      for(int i=0; i<str.length(); i++) {
        char ch = str.charAt(i);
        // "abcde" = "ab" + "de" => "abde" if we pick c 
        String ros = str.substring(0, i) + str.substring(i+1);
      findPermutation(ros, ans+ch);
    }
  }
  
  public static void main(String[] args) {
    String str = "abc";
    findPermutation(str, "");
  }
}
