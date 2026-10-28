package GreedyAlgorithm;

import java.util.*;

public class IndianCoins {
  public static void main(String[] args) {
    Integer coins[] = {1, 2, 5,10, 20, 50, 100, 500, 2000};

    Arrays.sort(coins, Comparator.reverseOrder());
    int count = 0;
    ArrayList<Integer> ans = new ArrayList<>();
    int amount = 4689;
    for (int i = 0; i < coins.length; i++) {
      while (amount >= coins[i]) {
        amount -= coins[i];
        ans.add(coins[i]);
        count++;
      }
    }
    System.out.println(count);
    System.out.println(ans); 
  }
}
