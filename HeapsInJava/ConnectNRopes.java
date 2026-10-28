package HeapsInJava;

import java.util.PriorityQueue;

public class ConnectNRopes {  
  public static void main(String[] args) {
    int ropes[] = {4,3,2,6};

    PriorityQueue<Integer> pq = new PriorityQueue<>();
     // min heap
     for(int i=0; i<ropes.length; i++) {
      pq.add(ropes[i]); 
    }

    int cost = 0;
    while(pq.size() > 1) {
      int first = pq.poll();
      int second = pq.poll();
      cost += first + second;
      pq.add(first + second);
    }
    System.out.println("Cost: " + cost); 
  }
}
