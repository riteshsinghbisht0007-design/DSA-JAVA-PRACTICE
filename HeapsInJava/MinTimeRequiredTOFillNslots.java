package HeapsInJava;

import java.util.*;

public class MinTimeRequiredTOFillNslots {

  public static int Mintime(int[] arr, int n, int k) {
    Queue<Integer> q = new LinkedList<>();
    boolean[] visited = new boolean[n + 1];


    for (int i = 0; i <k; i++) {
      q.add(arr[i]);
      visited[arr[i]] = true;
    }

    int time = 0;
    while(!q.isEmpty()){
      int size = q.size();
      boolean filledAny = false;
      for(int i = 0; i<size; i++){
        int curr = q.poll();

        // neighbors check karenge 
        int left = curr - 1;
        int right = curr + 1;

        // left neighbor find karne ke liye 
        if(left > 0 && !visited[left]){
          q.add(left);
          visited[left] = true;
          filledAny = true;
        }

        // right neighbor find karne ke liye 
        if(right <= n && !visited[right]){
          q.add(right);
          visited[right] = true;
          filledAny = true;
        }

      }

      if(filledAny){
        time++;
      }
      if(q.isEmpty()){
        return time;
      }
    }

    return time;
  }
  public static void main(String[] args) {
    int N = 6;
    int K = 2;
    int arr[] = {2,6};

    System.out.println(Mintime(arr, N, K));

  }
}
