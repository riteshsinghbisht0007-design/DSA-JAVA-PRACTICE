package LEETCODE_Practice;

public class TrappedWater {
  public static int trappedRainwater(int[] height){
     int n = height.length;
    // calculate left max boundary - leftMaxArray
     int leftMax[] = new int[n];
     leftMax[0] = height[0];
     for(int i = 1; i<n; i++){
       leftMax[i] = Math.max(leftMax[i-1], height[i]);
     }


    // calculate right max boundary - rightMaxArray
    int rightMax[] = new int[n];
    rightMax[n-1] = height[n-1];
    for(int i = n-2; i>=0; i--){
      rightMax[i] = Math.max(rightMax[i+1], height[i]);
    }


    int trappedWater = 0;
    // loop through the height array and find the water level at each index - waterLevelArray
    for(int i = 0; i<n; i++){
      int waterLevel = Math.min(leftMax[i], rightMax[i]) - height[i];
      trappedWater += waterLevel;
    }

    return trappedWater;




    // sum up the waterLevelArray to get the total trapped water

   

  }
  public static void main(String[] args) {
    int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println("Trapped water: " + trappedRainwater(height));
  }
} 
