package DivideNConquer;

public class MajOfElement {
  public static void majorityElement(int[] nums, int si, int ei) {
    // base case 
    if(si >= ei){
      return;

    }

    // kaam 
    int mid = si + (ei-si)/2;
    majorityElement(nums, si, mid); // left part 
    majorityElement(nums, mid+1, ei); // right part
    merge(nums, si, mid, ei);
  }

  public static void merge(int[] nums, int si, int mid, int ei) {
    int temp[] = new int[ei-si+1];
    int i = si;
    int j = mid+1;
    int k = 0;

    while(i <= mid && j<=ei){
      if(nums[i] < nums[j]){
        temp[k] = nums[i];
        i++;
      }else{
        temp[k] = nums[j];
        j++; 
      }
      k++;
    }

    // left part 
    while(i <= mid){
      temp[k] = nums[i];
      i++;
      k++;
    }

    // right part
    while(j <= ei){
      temp[k] = nums[j];
      j++;
      k++;
    }

    for(int l=0; l<temp.length; l++){
      nums[l+si] = temp[l];
    }
    
  }
  
  public static void main(String[] args) {
    int nums[] = {2,2,1,1,1,2,2};
    majorityElement(nums, 0, nums.length-1);


    // check majority
    for(int l=0; l<nums.length; l++){
      int count = 0;
      for(int m=0; m<nums.length; m++){
        if(nums[l] == nums[m]){
          count++;
        }
      }
      if(count > nums.length/2){
        System.out.println(nums[l]);
        return;
      }
    }
  }
}
