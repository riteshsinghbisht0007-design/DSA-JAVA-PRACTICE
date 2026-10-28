package RecursionBasics;

public class LengthOfString {
  public static int lengthOfString(String str, int idx) {
    if (idx == str.length()) {
      return 0;
    }
    return 1 + lengthOfString(str, idx + 1);
  }

  public static int CountContiguousSubstring(String str, int idx, String subStr) {
    if (idx == str.length()) {
      return 0;
    }
    if (str.substring(idx, idx + subStr.length()).equals(subStr)) {
      return 1 + CountContiguousSubstring(str, idx + 1, subStr);
    }
    return CountContiguousSubstring(str, idx + 1, subStr);
  }
  public static void main(String[] args) {
    String str = "apnacollege";
    System.out.println(lengthOfString(str, 0));
  }
}
