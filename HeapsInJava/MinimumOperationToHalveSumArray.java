package HeapsInJava;
import java.util.*;
public class MinimumOperationToHalveSumArray {
  public int halveArray(int[] nums) {
    PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder()); // min heap in reverse order 
    double sum = 0;
    for(int num : nums) {
      sum += num;
      pq.add((double)num);
    }
    double target = sum / 2;

    int operations = 0;
    while(sum > target){
      double largest = pq.poll();
      double half = largest / 2;
      sum -= half;
      pq.add(half);
      operations++;
    }
    return operations;

  }
  public static void main(String[] args) {
    int[] arr = {1,5,9,19};

    MinimumOperationToHalveSumArray obj = new MinimumOperationToHalveSumArray();
    System.out.println(obj.halveArray(arr));
  }
}
