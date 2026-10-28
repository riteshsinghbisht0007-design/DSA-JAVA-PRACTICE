package ArrayListInJava;
import java.util.*;

public class PairSum {
  public static boolean pairsum2(ArrayList<Integer> list, int target) {
    
    // T.C = O(n)
    // 2 pointers approach
    int lp = 0;
    int rp = list.size() - 1;
    while(lp < rp) {
      if(list.get(lp) + list.get(rp) == target) {
        return true;
      } else if(list.get(lp) + list.get(rp) < target) {
        lp++;
      } else {
        rp--;
      }
    }
    return false; 
  }
  public static boolean pairsum1(ArrayList<Integer> list, int target) {
    // T.C = O(n^2)

    for(int i=0; i<list.size(); i++) {
      for(int j=i+1; j<list.size(); j++) {
        if(list.get(i)+list.get(j) == target) {
          return true;
        }
      }
    }
    return false;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(10);

    // 1 2 3 4 5 6 7 8 9 10
    int target = 5;

    System.out.println(pairsum1(list, target));
  }
}
