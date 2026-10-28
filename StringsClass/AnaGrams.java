package StringsClass;
import java.util.*;

public class AnaGrams{


  
  public static  boolean isAnagram(String str1, String str2){

    // Time Complexity - O(n + n)
    if(str1.length() != str2.length()){
      return false;
    }
    char arr[] = str1.toCharArray();
    char arr2[] = str2.toCharArray();

    Arrays.sort(arr);
    Arrays.sort(arr2);
    int indexarr = 0;
    int indexarr2 = 0;

    while(indexarr < arr.length && indexarr2 < arr2.length){
      if(arr[indexarr] != arr2[indexarr2]){
        return false;
      }
      indexarr++;
      indexarr2++;
    }
    return true;
  }

  public static boolean isAnagram2(String str1, String str2){
    if(str1.length() != str2.length()){
      return false;
    }

    // Time Complexity - O(n)

    int count[] = new int[26];

    for(int i=0; i<str1.length(); i++){
      count[str1.charAt(i) - 'a']++;
      count[str2.charAt(i) - 'a']--;
    }
    for(int i=0; i<26; i++){
      if(count[i] != 0){
        return false;
      }
    }
    return true;
  }


  public static void main(String[] args) {
    String str1 = "race";
    String str2 = "card";
    // System.out.println(isAnagram(str1, str2));
    System.out.println(isAnagram2(str1, str2));
  }
}