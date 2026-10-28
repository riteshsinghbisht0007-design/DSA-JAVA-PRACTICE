package LinkedListInJava;

public class SearchKey {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public int itrSearch(int key){
    Node temp = head;
    int i = 0;
    while(temp != null){
      if(temp.data == key){
        return i;
      }
      temp = temp.next;
      i++;
    }
    return -1;
  }
  
  public int helper(Node head, int key){
    if(head == null){
      return -1;
    }
    if(head.data == key){
      return 0;
    }
    int idx = helper(head.next, key);
    if(idx == -1){
      return -1;
    }
    return idx + 1;
  }
  public int recSearch(int key){
    return helper(head, key);
  }
  public static void main(String[] args) {
      SearchKey ll = new SearchKey();
      ll.head = new Node(1);
      Node second = new Node(2);
      Node third = new Node(3);
      ll.head.next = second;
      second.next = third;

      //  ll.head -> 1 -> 2 -> 3 -> null  
      // System.out.println(ll.itrSearch(3));

      System.out.println(ll.recSearch(3));
  }
}
