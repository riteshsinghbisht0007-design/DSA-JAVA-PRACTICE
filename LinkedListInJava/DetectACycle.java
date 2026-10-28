package LinkedListInJava;

public class DetectACycle {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

// Floyd's Cycle Detection Algorithm (Tortoise and Hare Algorithm)
  public static boolean isCycle(Node head){
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null){
      slow = slow.next; // +1
      fast = fast.next.next; // +2

      if(slow == fast){
        return true;
      }
    }
    return false;
  }

  public static void removeCycle(Node head){
    Node slow = head;
    Node fast = head;

    // step 1: detect cycle
    boolean cycle = false;
    while(fast != null && fast.next != null){
      slow = slow.next; // +1
      fast = fast.next.next; // +2

      if(slow == fast){
        cycle = true;
        break;
      }
    }

    if(cycle == false){
      return;
    }

    // step 2: find meeting point
    slow = head;
    Node prev = null; // last node
    while(slow != fast){
      prev = fast;
      slow = slow.next;
      fast = fast.next;
    }

    // step 3: remove cycle -> last.next = null
    prev.next = null;
  }
  public static void main(String[] args) {
    Node head = new Node(1);
    Node temp = new Node(2);
    head.next = temp;
    head.next.next = new Node(3);
    head.next.next.next = head.next; // Create a cycle

    System.out.println(isCycle(head));
     // Output: true

     removeCycle(head);
     System.out.println(isCycle(head));
  }
}
