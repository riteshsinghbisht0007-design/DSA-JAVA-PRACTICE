package LinkedListInJava;
import java.util.LinkedList;
import java.util.*;

public class JavaCollectionFrameWork {
  public static void main(String[] args) {

    // create  - objects int, float , boolean and string 
    LinkedList<Integer> list = new LinkedList<>();
    list.addFirst(1);
    list.addLast(2);
    list.addFirst(3);

    System.out.println(list);

    // remove 
    list.removeFirst();
    list.removeLast();  
    System.out.println(list);
  }
}
