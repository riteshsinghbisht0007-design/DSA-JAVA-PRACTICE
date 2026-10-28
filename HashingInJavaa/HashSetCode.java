package HashingInJavaa;
import java.util.*;

public class HashSetCode {
  public static void main(String[] args) {
    // HashSet<Integer> set = new HashSet<>();

    // set.add(1);
    // set.add(2);
    // set.add(3);
    // set.add(4);
    // set.add(5);
    // set.add(6);
    // set.add(7);
    // set.add(8);
    // set.add(9);
    // set.add(10);
    // set.add(10);

    // if(set.contains(10)) {
    //   System.out.println("Present");
    // }

    
    // System.out.println(set);


    HashSet<String> cities = new HashSet<>();

    cities.add("Delhi");
    cities.add("Mumbai");
    cities.add("Pune");
    cities.add("Kolkata");
    cities.add("Chennai");

    System.out.println(cities);

    // Iterator itr = cities.iterator();
    // while(itr.hasNext()) {
    //   System.out.println(itr.next());
    // }

    // // advanced loop 
    // for(String city : cities) {
    //   System.out.println(city);
    // }

    // Linked Hash set 
    LinkedHashSet<String> lhs = new LinkedHashSet<>();
      lhs.add("Delhi");
      lhs.add("Mumbai");
      lhs.add("Pune");
      lhs.add("Kolkata");
      lhs.add("Chennai");
      lhs.add("Delhi");

      System.out.println(lhs);
      // lhs.remove("Delhi");

      // System.out.println(lhs);

      /// Tree Set 
      TreeSet<String> ts = new TreeSet<>();
      ts.add("Delhi");
      ts.add("Mumbai");
      ts.add("Pune");
      ts.add("Kolkata");
      ts.add("Chennai");
      ts.add("Delhi");
      ts.add("Andmaan");
      ts.add("Bengaluru");

      System.out.println(ts);

  }
}
