package QueuesInJava;

import java.util.*;

public class DoubleEndedQueue {
  static class Stack{
    Deque<Integer> deque = new LinkedList<>();

    public void push(int data){
      deque.addLast(data);

    }

    public int pop(){
      return deque.removeLast();
    }

    public int peek(){
      return deque.getLast();
    }
  }

  public static class Queue{
    Deque<Integer> deque = new LinkedList<>();

    public void add(int data){
      deque.addLast(data);
    }

    public int remove(){
      return deque.removeFirst();
    }

    public int peek(){
      return deque.getFirst();
    } 
  }
  public static void main(String[] args) {
  //   Deque<Integer> q = new LinkedList<>();
  //  q.addFirst(1);
  //  q.addLast(2);
  //  q.addFirst(3);
  //  q.addLast(4);
  //  q.addFirst(5);
  //  q.removeFirst();
  //  q.removeLast();
  //  System.out.println(q);


  //  System.out.println("First element: " + q.getFirst());
  //  System.out.println("Last element: " + q.getLast());

  // Stack s = new Stack();
  // s.push(1);
  // s.push(2);
  // s.push(3);
  // s.push(4);
  // System.out.println(s.pop());
  
   Queue q = new Queue();
   q.add(1);
   q.add(2);
   q.add(3);
   q.add(4);
   System.out.println(q.remove());
   System.out.println(q.peek());
}
}
