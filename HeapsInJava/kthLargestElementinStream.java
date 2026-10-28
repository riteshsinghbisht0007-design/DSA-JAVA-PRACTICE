package HeapsInJava;

import java.util.*;

public class kthLargestElementinStream {
  static class Large implements Comparable<Large>{
    int k;
    public Large(int k){
      this.k = k;
    
    }
    @Override 
    public int compareTo(Large l2) {
      return this.k - l2.k;
    } 
  }
  public static void main(String[] args) {
    int[] stream = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // 5 largest elements in the stream will be printed at the end
    int k = 3;

    PriorityQueue<Large> pq = new PriorityQueue<>(); // min heap

    for(int i=0; i<k; i++) {
      pq.add(new Large(stream[i]));
    }

    for(int i=k; i<stream.length; i++) {
      if(pq.peek().k < stream[i]) {
        pq.remove();
      }

      pq.add(new Large(stream[i]));
      System.out.println(pq.peek().k);
    }
  }
}
