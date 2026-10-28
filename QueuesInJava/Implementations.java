package QueuesInJava;

public class Implementations {
  static class Node{
     int data;
     Node next;
     Node(int data){
       this.data = data;
       this.next = null;
     }
  }

  static class Queuue{
    static Node head = null, tail = null;

    public static boolean isEmpty(){
      return head == null && tail == null;
    }

    // add
    public static void add(int data){
      Node newNode = new Node(data);
      if(head == null){
        head = newNode;
        tail = newNode;
      return; 
      }
      tail.next = newNode;
      tail = newNode; 
    } 

    public static int remove(){
      if(isEmpty()){
        System.out.println("Queue underflow");
        return -1;
      }
      int front = head.data;
      if(tail ==  head){
        tail = null;
        head = null;
      } else {
      head = head.next;
      }
      return front;
  
    }
     
    public static int peek(){
      if(isEmpty()){
        System.out.println("Queue underflow");
        return -1;
      }
      return head.data;
    }

    public static boolean isFull(){
      return false;
    }
  }
  public static void main(String[] args) {
    Queuue q = new Queuue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5); 

    while(!q.isEmpty()){
      System.out.println(q.peek() + " ");
      q.remove();
    }


  }
}
