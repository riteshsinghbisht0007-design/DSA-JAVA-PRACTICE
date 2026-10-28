package GreedyAlgorithm;
import java.util.*;
public class FractionalKnapSack {
  public static void main(String[] args) {
    int val[] = {60, 100, 120}; // profit
  int wt[] = {10, 20, 30}; // weight
  int W = 50; // capacity of knapsack

  double ratio[][] = new double[val.length][2]; // [2];

  // 0th col => idx; 1st col => ratio
  
    for (int i = 0; i < val.length; i++) {
      ratio[i][0] = i;
      ratio[i][1] = val[i] / (double) wt[i];
  }

  // Ascending order of ratio
  Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

  int capacity = W;
  int finalValue = 0;

  for(int i=ratio.length-1; i>=0; i--) {
    int idx = (int) ratio[i][0];
    int weight = wt[idx];
    int value = val[idx];

    if(capacity >= weight){ // include full item
      capacity -= weight;
      finalValue += value;
    } else {
      finalValue += (ratio[i][1] * capacity); // include fractional item
      break;
    }

    
  }

  System.out.println("Final value is: " + finalValue);
  }
}

