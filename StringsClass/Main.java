// count how many times lowercase vowels occurred in a String entered by user



package StringsClass;

public class Main {
  public static String checkStr(String str) {
    int count = 0;
    for(int i=0; i<str.length(); i++) {
      if(str.charAt(i) != str.toUpperCase().charAt(i)) {
        count++;
      }
    }
    return String.valueOf(count);

}
  
  public static void main(String[] args) {
    String str = "hello worLd";
    System.out.println(checkStr(str));
  }
}
