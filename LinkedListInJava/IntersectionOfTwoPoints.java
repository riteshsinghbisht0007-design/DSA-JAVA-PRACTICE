package LinkedListInJava;
import java.util.LinkedList;

public class IntersectionOfTwoPoints {
  public class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public Node headA;
  public Node headB;

  public int getIntersectionNode(Node headA, Node headB){
    if(headA == null || headB == null) {
      return -1;
    }
    
    Node a = headA;
    Node b = headB;

    while(a != b) {
      a = a == null ? headB : a.next;
      b = b == null ? headA : b.next;
    }
    // for no intersection case, a and b will be null at the end of the loop, so we can return -1
    if(a == null) {
      return -1;
    }

    return a.data;
  }


  //  Delete N nodes After M nodes of a linked list

  public int DeleteNNodesAfterMNodes(Node head, int M, int N) {
    if(head == null || M < 0 || N < 0) {
      return -1;
    }

    Node curr = head;
    while(curr != null) {
      // skip M nodes
      for(int i = 1; i < M && curr != null; i++) {
        curr = curr.next;
      }
      if(curr == null) {
        break;
      }

      // delete N nodes
      Node temp = curr.next;
      for(int i = 0; i < N && temp != null; i++) {
        temp = temp.next;
      }
      curr.next = temp;
      curr = temp;
    }
    return 0;
  }
  public static void main(String[] args) {
    LinkedList<Integer> listA = new LinkedList<>();
    listA.add(1);
    listA.add(2); 
    listA.add(3);
    listA.add(4);
    listA.add(5);

    
    // solution.DeleteNNodesAfterMNodes(listA, 2, 2);
  }
}
