package HashingInJavaa;
import java.util.*;
public class Iteration {
  public static void main(String[] args) {
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India", 1000);
    hm.put("USA", 2000);
    hm.put("Russia", 3000);
    hm.put("China", 4000);
    hm.put("Japan", 5000);

    // Iterrate 
    Set<String> keys = hm.keySet();
    System.out.println(keys);

    for (String k : keys) {
      System.out.println("key = " + k + " value = " + hm.get(k));
    }
  }
}
 