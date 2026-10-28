package ArrayListInJava;

import java.util.ArrayList;

public class ContainMostWaterFlipKart {

  public static int storeWater2(ArrayList<Integer> height) {
    int lp = 0;
    int rp = height.size() - 1;
    int maxWater = 0;

    while (lp < rp) {
      int ht = Math.min(height.get(lp), height.get(rp));
      int width = rp - lp;
      int currWater = ht * width;
      maxWater = Math.max(maxWater, currWater);

      if (height.get(lp) < height.get(rp)) {
        lp++;
      } else {
        rp--;
      }
    }

    return maxWater;
  }

  // brute force approach .... T.C = O(n^2)
  public static int storeWater(ArrayList<Integer> height) {
    int maxWater = 0;

    // brute force 
    for(int i=0; i<height.size(); i++) {
      for(int j=i+1; j<height.size(); j++) {
        int ht = Math.min(height.get(i), height.get(j));
        int width = j - i;
        int currWater = ht * width;
        maxWater = Math.max(maxWater, currWater);
      }
    }

    return maxWater;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(8);
    list.add(6);
    list.add(2);
    list.add(5);
    list.add(4);
    list.add(8);
    list.add(3);
    list.add(7);

    // 1 8 6 2 5 4 8 3 7

    System.out.println(storeWater2 (list));
  }
}
