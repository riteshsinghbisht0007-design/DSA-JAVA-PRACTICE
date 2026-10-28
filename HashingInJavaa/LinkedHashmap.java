package HashingInJavaa;
import java.util.*;

public class LinkedHashmap {
  public static void main(String[] args) {
    LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

    map.put("India", 1000);
    map.put("USA", 2000);
    map.put("Russia", 3000);
    map.put("China", 4000);
    map.put("Japan", 5000);


    HashMap<String, Integer> hm = new HashMap<>();

    hm.put("India", 1000);
    hm.put("USA", 2000);
    hm.put("Russia", 3000);
    hm.put("China", 4000);
    hm.put("Japan", 5000);

    TreeMap<String, Integer> tmp = new TreeMap<>();

    tmp.put("India", 1000);
    tmp.put("USA", 2000);
    tmp.put("Russia", 3000);
    tmp.put("China", 4000);
    tmp.put("Japan", 5000);

    System.out.println(map);
    System.out.println(hm);
    System.out.println(tmp);
  }
}
