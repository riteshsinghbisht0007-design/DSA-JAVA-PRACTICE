package ArraysInJava; 
public class KadaneALGO {
    public static void main(String[] args) {
        int[] arr = {-2,-1,-35,-67};
        kadanes(arr);
    }

    public static void kadanes(int[] arr) {
      int maxSum = Integer.MIN_VALUE;
      int currSum = 0;

      // checking if all elements are negative
      boolean allNegative = true;
      for(int i = 0; i<arr.length; i++){
        if (arr[i] >= 0){
          allNegative = false;
          break;
        }
      }

      if (allNegative) {
        for(int i = 0; i<arr.length; i++){
          maxSum = Math.max(maxSum, arr[i]);
        }
        System.out.println("Maximum subarray sum is: " + maxSum);
        return;
      }


      for(int i =0; i<arr.length; i++){
        currSum += arr[i];
        
        if (currSum < 0) {
          currSum = 0;
        }
        maxSum = Math.max(maxSum, currSum);
      }
      
      System.out.println("Maximum subarray sum is: " + maxSum);
    }
}