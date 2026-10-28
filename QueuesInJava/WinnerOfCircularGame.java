package QueuesInJava;
import java.util.*;

public class WinnerOfCircularGame {
    public int findTheWinner(int n, int k) {
      Queue<Integer> q = new LinkedList<>();
      for(int i=1; i<=n; i++){
        q.add(i);
      }
      while(q.size()>1){
        // k-1 elements remove and add 
        for(int i=1; i<k; i++){
          q.add(q.remove());
        }
        q.remove();
      }
      return q.peek();
    }
  
}
