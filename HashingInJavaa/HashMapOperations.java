package HashingInJavaa;
import java.util.*;

public class HashMapOperations {
  public static void main(String[] args) {
    // create 
    HashMap<String, Integer> map = new HashMap<>();

    // insert 
    map.put("India", 1000);
    map.put("USA", 2000);
    map.put("Russia", 3000);
    map.put("China", 4000);
    map.put("Japan", 5000);

    // display 
    System.out.println(map);

    // get 
    System.out.println(map.get("India"));

    // containsKey 
    System.out.println(map.containsKey("India"));

    // remove 
    map.remove("Russia");
    System.out.println(map);

     /// size

  System.out.println(map.size());

  // isEmpty
  System.out.println(map.isEmpty()); 
  }
}
