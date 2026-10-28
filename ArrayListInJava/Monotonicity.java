package ArrayListInJava;
import java.util.*;

public class Monotonicity {
  public static boolean isMonotonic(ArrayList<Integer> list) {
    // for increasing order and decreasing order
    boolean inc = true, dec = true;
    for(int i=0; i<list.size()-1; i++) {
      if(list.get(i) > list.get(i+1)) {
        inc = false;
      }
      if(list.get(i) < list.get(i+1)) {
        dec = false;
      }
    }
    return inc || dec;
  }


  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // list.add(6);
    // list.add(5);
    // list.add(4);
    // list.add(4);

    // 1 2 2 3

    // list.add(1);
    // list.add(2);
    // list.add(2);
    // list.add(3);

    // 1 3 2

    list.add(1);
    list.add(3);
    list.add(2);


    System.out.println(isMonotonic(list));
  }
}
