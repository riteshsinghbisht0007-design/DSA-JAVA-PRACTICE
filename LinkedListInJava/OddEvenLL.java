package LinkedListInJava;
import java.util.LinkedList;

public class OddEvenLL {

  public static void oddEven2(Node head) {
    for(Node curr = head; curr != null; curr = curr.next) {
      if(curr.data % 2 == 0) {
        System.out.print(curr.data + " ");
      }
    }
    for(Node curr = head; curr != null; curr = curr.next) {
      if(curr.data % 2 != 0) {
        System.out.print(curr.data + " ");
      }
    }
    
  }
  public static void oddEven(LinkedList<Integer> list) {
    LinkedList<Integer> odd = new LinkedList<>();
    LinkedList<Integer> even = new LinkedList<>();

    for(int i = 0; i < list.size(); i++) {
      if(list.get(i) % 2 == 0) {
        even.add(list.get(i));
      } else {
        odd.add(list.get(i));
      }
    }
    list.clear();
    list.addAll(even);
    list.addAll(odd);

  }
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    // 8-> 12 -> 10 -> 5 -> 4 -> 1 -> 6 -> null\
    list.addFirst(8);
    list.addFirst(12);  
    list.addFirst(10);
    list.addFirst(5);
    list.addFirst(4);
    list.addFirst(1);
    list.addFirst(6);
    System.out.println(list);
    oddEven(list);
    System.out.println(list);
  }
}
