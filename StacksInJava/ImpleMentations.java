package StacksInJava;

import java.util.*;

public class ImpleMentations {

  static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
   
  static class StackUsingLL {
    public static Node head;

    public static boolean isEmpty() {
      return head == null;
    }

    // push
    public static void push(int data) {
      Node newNode = new Node(data);
      if(isEmpty()) {
        head = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
    }

    // pop
    public static int pop() {
      if(isEmpty()) {
        return -1;
      }
      int top = head.data;
      head = head.next;
      return top;
    }

    // peek
    public static int peek() {
      if(isEmpty()) {
        return -1;
      }
      return head.data;
    }
  }



  static class Stack {
    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty() {
      return list.size() == 0;
    }


    //. push 

    public static void push(int data) {
      list.add(data);
    }

    // pop
    public static int pop() {
      if(isEmpty()) {
        return -1;
      }
      int top = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      return top;
    }

    // peek 
    public static int peek() {
      if(isEmpty()) {
        return -1;
      }
      return list.get(list.size() - 1);
    }
  }
  public static void main(String[] args) {
    // StackUsingLL s = new StackUsingLL();
    // s.push(1);
    // s.push(2);
    // s.push(3);

    // while(!s.isEmpty()) {
    //   System.out.println(s.peek());
    //   s.pop();
    // }


    // using java collection framework

    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    System.out.println(s.peek());
    
    while(!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }


  }
}
