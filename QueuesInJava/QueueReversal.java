package QueuesInJava;

import java.util.*;

public class QueueReversal {
  public static void reverseQueue(Queue<Integer> q) {
    Queue<Integer> q1 = new LinkedList<>();
    Stack<Integer> s = new Stack<>();

    while(!q.isEmpty()){
      s.push(q.remove());
    }
    while(!s.isEmpty()){
      q1.add(s.pop());
    }
    q.addAll(q1);
  }
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    reverseQueue(q);
    System.out.println(q);
  }
}
