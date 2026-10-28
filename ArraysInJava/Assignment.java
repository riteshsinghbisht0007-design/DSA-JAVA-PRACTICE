package ArraysInJava;

public class Assignment {
  public static boolean containsDuplicate(int [] nums){
    int n = nums.length;
    for(int i =0; i < n; i++){
      for(int j = i+1; j< n; j++){
        if(nums[i] == nums[j]){
          return true;
        }
      }
    }
    return false;
  }

  public static int[][] printTriplets(int [] nums){
    int n = nums.length;
    int result[][] = new int[100][3];
    int count = 0;
    for(int i =0; i<n; i++){
      for(int j = i+1; j<n;j++){
        for(int k = j+1; k<n; k++){
          int sum = nums[i] + nums[j] + nums[k];
          if(sum == 0){
            result[count][0] = nums[i];
            result[count][1] = nums[j];
            result[count][2] = nums[k];
            count++;
          }
        }
      }
    }
    return result;
  }
  public static void main(String[] args) {
    // int [] nums = {1, 1,1,3,3,4,3,2,4,2};
    // System.out.println(containsDuplicate(nums));
    int [] nums = {-1, 0, 1,2,-1,-4};
    int [][] triplets = printTriplets(nums);
    for(int i =0; i<triplets.length; i++){
      if(triplets[i][0] == 0 && triplets[i][1] == 0 && triplets[i][2] == 0){
        break;
      }
      System.out.println(triplets[i][0] + " " + triplets[i][1] + " " + triplets[i][2]);
    }
  }
}
