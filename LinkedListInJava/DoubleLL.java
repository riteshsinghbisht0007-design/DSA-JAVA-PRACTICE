package LinkedListInJava;

public class DoubleLL {
  public class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }
  public static Node head;
  public static Node tail;
  public static int size;


  // add 
  public void addFirst(int data){
    Node newNode = new Node(data);
    size++;
    if(head == null){
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
  }

  public int removeFirst(){
    if(size == 0){
      System.out.println("LL is empty");
      return -1;
    }else if(size == 1){
      head = tail = null;
      size--;
      return -1;
    }
    int val = head.data;
    head = head.next;
    head.prev = null;
    size--;
    return val;
  }

  // print 
  public void print(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + "<->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void reverseADll(){
    Node curr = head;
    Node prev = null;
    Node next;
    while(curr != null){
      next = curr.next;
      curr.next = prev;
      curr.prev = next;
      prev = curr;
      curr = next;
    }
    head = prev;
  }


  
  public static void main(String[] args) {
    DoubleLL dll = new DoubleLL();

    dll.addFirst(2);
    dll.addFirst(1);
    dll.addFirst(8);
    dll.addFirst(9);
    dll.print();
    // dll.addLast(3);
    dll.print();
    dll.removeFirst();
    dll.print();
    dll.reverseADll();
    dll.print();
  }
}
