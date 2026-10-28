package HashingInJavaa;
import java.util.*;
public class SortByFrequency {
  public static void printFreq(String s){
    TreeMap<Character, Integer> map = new TreeMap<>();
   // oth 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
// Note that "cacaca" is incorrect, as the same characters must be together.


  }
  public static void main(String[] args) {
    String s = "tree";

    TreeMap<Character, Integer> map = new TreeMap<>();

    // print in sorted order for tree so output is eert 
    printFreq(s);


    for(int i=0; i<s.length(); i++){
      char ch = s.charAt(i);
      if(map.containsKey(ch)){
        map.put(ch, map.get(ch)+1);
      }
      else{
        map.put(ch, 1);
      }
    }

    for(Character ch : map.keySet()){
      System.out.print(ch);
  }
}
}
