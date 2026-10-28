package ArraysInJava;
import java.util.*; 
public class ArrList {
  public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList<Integer>();
    // ArrayList<String> list1 = new ArrayList<String>();
    // ArrayList<Boolean> list2 = new ArrayList<Boolean>();
    // add elements 
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
    System.out.println(list);


    // get elements 
    int element = list.get(2);
    System.out.println(element);

    // remove element 
    list.remove(2);
    System.out.println(list);

    // set element 
    list.set(2, 20);
    System.out.println(list);

    // size
    int size = list.size();
    System.out.println(size);

    // loops
    for(int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }

    // sorting 
    Collections.sort(list);
    System.out.println(list);

    // reverse 
    Collections.reverse(list);
    System.out.println(list);

    // contains 
    boolean contains = list.contains(20);
    System.out.println(contains);
  }
}
