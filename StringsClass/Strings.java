package StringsClass;
public class Strings {
  public static void printLetters(String str) {
    for(int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i) + " ");
    } 
  }

  
  public static boolean isPalindrome(String str) {
    for(int i=0; i<str.length()/2; i++) {
      int n=str.length()-1-i;
      if(str.charAt(i) != str.charAt(n-1-i)) {
        // not a palindrome
        return true;
      }
    }
    return false;
  }

  public static int getShortestPath(String path){
    int x = 0;
    int y = 0;

    for(int i=0; i<path.length(); i++){
      char dir = path.charAt(i);

      if(dir == 'N'){
        y++;
      }else if(dir == 'S'){
        y--;
      }else if(dir == 'E'){
        x++;
      }else if(dir == 'W'){
        x--;
      }
    }
    int X2 = x*x;
    int Y2 = y*y;
    return (int)Math.sqrt(X2 + Y2);
  }

  public static String reverse(String str){
    String revStr = "";
    for(int i=str.length()-1; i>=0; i--){
      revStr += str.charAt(i);
    }
    return revStr;
  }

  public static String revVowels(String str){
    String revStr = "";
    for(int i=str.length()-1; i>=0; i--){
      char ch = str.charAt(i);
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
        revStr += str.charAt(i);
      }
    }
    return revStr;
  }

  public static String subString(String str, int start, int end){
    String subStr = "";
    for(int i=start; i<end; i++){
      subStr += str.charAt(i);
    }
    return subStr;
  }
  
  
  public static void main(String[] args) {
    // char arr[] = {'a', 'b', 'c', 'd', 'e'};
    // String str = "abcd";
    // String str2 = new String("xyz@123");

    // Scanner sc = new Scanner(System.in);
    // String name;
    // name = sc.nextLine();
    // System.out.println(name);

    // String fullName = "TonyStark";
    // System.out.println(fullName.length());

    // concatenation 
    // String firstName = "Tony"; 
    // String lastName = "Stark"; 
    //  String fullName = firstName + " " + lastName;
    // System.out.println(fullname.charAt(1));

    // printLetters("Shradha mam I Love U");

    //  String str = "noon";
    // System.out.println(isPalindrome(str));

    // String path = "NNESEENW";
    // System.out.println(getShortestPath(path)); 


    String s1 = "Tony";
    String s2 = "Tony";
    String s3 = new String("Tony");

    // if(s1 == s2){
    //   System.out.println("Strings are equal");
    // } else {
    //   System.out.println("Strings are not equal");
    // }

    // if(s1 == s3){
    //   System.out.println("Strings are equal");
    // } else {
    //   System.out.println("Strings are not equal");
    // }

    // if(s1.equals(s3)){
    //   System.out.println("Strings are equal");
    // } else {
    //   System.out.println("Strings are not equal");
    // }

// String str="ShradhaDidi";
// String str1="ApnaCollege";
// String str2="ShradhaDidi";
// System.out.println(str.equals(str1) +" "+str.equals(str2));

String str = "ApnaCollege".replace("Apna", "Shradha");
System.out.println(str);

    // SubString
    // String str = "HelloWorld";
    // System.out.println(subString(str, 2, 6));




    // String fruits[] = {"apple", "banana", "mango"};
    
    // String largest = fruits[0];
    // for(int i=1; i< fruits.length; i++){
    //   if(largest.compareTo(fruits[i]) < 0){
    //     largest = fruits[i];
    //   }
    // }
    // System.out.println(largest);



    // Interning :- string pool
    

  }
}
