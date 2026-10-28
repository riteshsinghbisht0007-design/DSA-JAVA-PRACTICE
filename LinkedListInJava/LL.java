package LinkedListInJava;

public class LL {
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
  public static int size;

  // methods 
  public void addFirst(int data){
    // 
    // step 1: create a new node
    Node newNode = new Node(data);
    size++;

    if(head == null){
      head = tail = newNode;
      return;
    }
    // step 2: newNode next = head
    newNode.next = head;

    // step 3: head = newNode
    head = newNode;

  }
   

  public void addlast(int data){
    Node newNode = new Node(data);
    size++; 
    if(head == null){
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public void print(){
    if(head == null){
      System.out.println("LL is empty");
      return;
    }
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void add(int idx, int data){
    if(idx == 0){
      addFirst(data);
      return;
    }

    Node newNode = new Node(data);
    size++;
    Node temp = head;

    int i = 0;
    while(i < idx-1){
      temp = temp.next;
      i++;
    }
    // i = idx-1; temp -> prev
    newNode.next = temp.next;
    temp.next = newNode;

  }
  public int removeFirst(){
    if(size == 0){
      System.out.println("LL is empty");
      return Integer.MIN_VALUE;
    }
    else if(size == 1){
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  public int removeLast(){
    if(size == 0){
      System.out.println("LL is empty");
      return Integer.MIN_VALUE;
    }
    else if(size == 1){
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }

    // prev : i = size-2
    Node prev = head;
    for(int i=0; i<size-2; i++){
      prev = prev.next;
    }
    int val = prev.next.data; // tail.data
    prev.next = null;
    tail = prev;
    size--;
    return val;
  }

  //  Reverse a linked list iteratively
public void reverse(){
    Node prev = null;
    Node curr = tail = head;
    Node next;
    while(curr != null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }


  // Find and remove Nth node from the end of the linked list
  public void removeNthFromEnd(int n){
    // calculate size
    int size = 0;
    Node temp = head;
    while(temp != null){
      temp = temp.next;
      size++;
    }

    if(n == size){
      head = head.next; // remove first
      return;
    }
     
    // size - n
    int i = 1;
    int iToFind = size - n;
    Node prev = head;
    while(i < iToFind){
      prev = prev.next;
      i++;
    }
    prev.next = prev.next.next;
    return; 
    
  }

  public Node findMid(Node head){ // helper function
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null){
      slow = slow.next; // +1
      fast = fast.next.next; // +2
    }
    return slow; // slow is my mid node
  }

  public boolean isPalindrome(){
    if(head == null || head.next == null){
      return true;
    }

    // step 1: find mid
    Node midNode = findMid(head);

    // step 2: reverse 2nd half
    Node prev = null;
    Node curr = midNode;
    Node next;
    while(curr != null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    Node right = prev; // right half head
    Node left = head; 

    // step 3: check palindrome
    while(right != null){
      if(left.data != right.data){
        return false;
      }
      left = left.next;
      right = right.next;
    }
    return true;
    
  }

  public void zigZag(){
    // find mid 
    Node mid = findMid(head);


    // reverse 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;

    while(curr != null){
      next = curr.next;
      curr.next = prev; 
      prev = curr;
      curr = next;
    }
    

    Node left = head; // left half head
    Node right = prev; // right half head
    Node nextL, nextR;

    // alternate merge - zig-zag merge

    while(left != null && right != null){
      nextL = left.next;
      nextR = right.next;
      left.next = right;
      right.next = nextL;

      left = nextL;
      right = nextR;
    }

  }




  public static void main(String[] args) {
    LL list = new LL();
    // list.head = new Node(1);
    // list.head.next = new Node(2);
    // list.head.next.next = new Node(3);

    // list.addFirst(2);
    // list.addFirst(1);
    // list.addlast(3);
    // list.addlast(4);
    // list.addlast(5);

    // list.print(); // 1->2->3->4->5->null
    // list.add(2,8);
    // list.print();
    // System.out.println("Size: " + list.size);

    
    // list.removeFirst();
    // list.print(); 
    // System.out.println("Size: " + list.size);

    // list.removeLast();
    // list.print();
    // System.out.println("Size: " + list.size);

    // list.reverse();
    // list.print();  // 5->4->3->2->1->null

    // list.removeNthFromEnd(2);
    // list.print();  // 5->4->3->1->null


    list.addlast(1);
    list.addlast(2);
    list.addlast(3);
    list.addlast(4); 
    list.addlast(5);
    list.addlast(6);
    list.print();

    // System.out.println(list.isPalindrome());

    list.zigZag();
    list.print();
  }
}