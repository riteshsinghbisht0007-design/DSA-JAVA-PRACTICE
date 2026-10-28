package HeapsInJava;
import java.util.*;
public class MergeKSortedLL {
  static class Node {
    int data;
    Node next;
    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node mergeKLists(Node[] lists) {
    PriorityQueue<Node> pq = new PriorityQueue<>();

    for (int i = 0; i < lists.length; i++) {
      if (lists[i] != null) {
        pq.add(lists[i]);
      }
    }

    Node head = null;
    Node tail = null;

    while (pq.size() > 0) {
      Node curr = pq.remove();
      if (head == null) {
        head = curr;
        tail = curr;
      } else {
        tail.next = curr;
        tail = curr;
      }

      if (curr.next != null) {
        pq.add(curr.next);
      }
    }
    return head;

  }
  public static void main(String[] args) {
    int k = 3;
    int N = 4;

    //  list 1 = 1 2 3 4
    Node list1 = new Node(1);
    list1.next = new Node(2);
    list1.next.next = new Node(3);
    list1.next.next.next = new Node(4);

    //  list 2 = 5 6 7 8
    Node list2 = new Node(5);
    list2.next = new Node(6);
    list2.next.next = new Node(7);
    list2.next.next.next = new Node(8);


    //  list 3 = 9 10 11 12
    Node list3 = new Node(9);
    list3.next = new Node(10);
    list3.next.next = new Node(11);
    list3.next.next.next = new Node(12);

    
    Node[] lists = new Node[k];
    lists[0] = list1;
    lists[1] = list2;
    lists[2] = list3;
    Node head = mergeKLists(lists);
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }

  }
}
