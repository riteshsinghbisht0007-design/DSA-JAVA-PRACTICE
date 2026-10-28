package LinkedListInJava;
import java.util.LinkedList;

public class AddTwoNumber {
  public static void main(String[] args) {
    LinkedList<Integer> list1 = new LinkedList<>();
    LinkedList<Integer> list2 = new LinkedList<>();
    list1.add(2);
    list1.add(4);
    list1.add(3);
    list2.add(5);
    list2.add(6);
    list2.add(4);

    LinkedList<Integer> list3 = new LinkedList<>();
    int carry = 0;
    int sum = 0;

    // list1 = 342, list2 = 465
    while (list1.size() > 0 || list2.size() > 0) {

      // list1 = 42, list2 = 65
      if (list1.size() > 0) {
        sum += list1.peek();
        list1.removeFirst();
      }
      if (list2.size() > 0) {
        sum += list2.peek();
        list2.removeFirst();
      }

      // sum = 107
      sum += carry;
      // carry = 1

      carry = sum / 10;
      // sum = 7
      list3.add(sum % 10);
      sum = 0;
    }
    System.out.println(list3);
  }
}
