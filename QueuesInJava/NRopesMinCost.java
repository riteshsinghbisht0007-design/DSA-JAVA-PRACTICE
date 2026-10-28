
import java.util.PriorityQueue;

public class NRopesMinCost {
  public static int countCost(int a[]){
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int i=0; i<a.length; i++){
      pq.add(a[i]);
    }
    int ans = 0;
    while(pq.size() > 1){
      int first = pq.remove();
      int second = pq.remove();
      ans += first + second;
      pq.add(first + second);
    }
    return ans;
  }
  public static void main(String[] args) {
    int a[] = {4, 3, 2, 6};
    System.out.println(countCost(a)); 
  }
}
