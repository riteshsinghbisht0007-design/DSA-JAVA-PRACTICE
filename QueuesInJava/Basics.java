package QueuesInJava;
import java.util.*;

public class Basics {

  private static void display(Queue<Integer> q) {
    int n = q.size();
    for (int i = 0; i < n; i++) {
      System.out.print(q.peek() + " ");
      q.add(q.remove());
    }
    System.out.println();
  }

  private static void addAtIndex(Queue<Integer> q,int index, int val) {
    int n = q.size();
    for (int i = 0; i < n; i++) {
      if (i == index) {
        q.add(val);
      }
      System.out.print(q.peek() + " ");
      q.add(q.remove());
    }
    System.out.println();
  }

  // reverse a queue 
 

  public static void main(String[] args) {
    
  Queue<Integer> q = new LinkedList<>();
  q.add(10); q.add(20); q.add(30); q.add(40);
 display(q);
 
 addAtIndex(q, 2, 50);
 display(q);
 

 
  }

}
