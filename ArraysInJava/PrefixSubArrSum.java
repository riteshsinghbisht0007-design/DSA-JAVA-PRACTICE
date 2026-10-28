package ArraysInJava;

public class PrefixSubArrSum {
  public static void prefixSum(int nums[]) {
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[nums.length];
    prefix[0] = nums[0];
    // Calculate the prefix sum array
    for(int i=1; i<prefix.length; i++) {
      prefix[i] = prefix[i-1] + nums[i];
    }
    

    for(int i =0; i<nums.length; i++){
      int start = i;
      for(int j = i; j<nums.length; j++){
        int end = j;
        int currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1];

        if (currSum > maxSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println("Maximum Sum in All Sub Arrays: " + maxSum); 
  }
  public static void main(String[] args) {
    int nums[] = {1, 2, 3, 4, 5};
    prefixSum(nums);
  }
}
