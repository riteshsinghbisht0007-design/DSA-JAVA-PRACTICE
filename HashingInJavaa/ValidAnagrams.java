package HashingInJavaa;
import java.util.*;
public class ValidAnagrams {

  public static boolean isAnagram(String s, String t) {
    if(s.length() != t.length()){
      return false;
    }
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i=0; i<s.length(); i++){
       if(map.containsKey(s.charAt(i))){
         map.put(s.charAt(i), map.get(s.charAt(i))+1);
       }else{
         map.put(s.charAt(i), 1);
       } 
     }

     for(int i=0; i<t.length(); i++){
      char ch = t.charAt(i);
      if(map.get(ch) != null){
        if(map.get(ch) == 1){
          map.remove(ch);
        }else{
          map.put(ch, map.get(ch)-1);
        }
      } else {
        return false;
      }
     }
     return map.isEmpty();
  }
  public static void main(String[] args) {
     String s = "anagram", t = "nagaram";
     System.out.println(isAnagram(s, t));
  }
}

