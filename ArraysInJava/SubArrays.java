package ArraysInJava;

public class SubArrays {
  public static void maxSubArraysSum(int nums[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;


    int totalSubArrays = 0;
    for(int i=0; i<nums.length; i++) {
      int start = i;
      for(int j=i; j<nums.length; j++) {
        int end = j;
        currSum = 0; // Reset sum for the new subarray
        for(int k=start; k<=end; k++) {
          System.out.print(nums[k] + " ");
          // Calculate the sum of the current subarray
          currSum += nums[k];
        }
        totalSubArrays++;
        if(currSum > maxSum) {
          maxSum = currSum;
        }
        System.out.println(" " + " Sum: " + currSum);
        currSum = 0; // Reset sum for the next subarray
      }
    }
    System.out.println("Total Sub Arrays: " + totalSubArrays);
    System.out.println("Maximum Sum in All Sub Arrays: " + maxSum);
  }
  public static void main(String[] args) {
    int nums[] = {1, -2, 6, -1, 3};
    maxSubArraysSum(nums);
  }
}
 