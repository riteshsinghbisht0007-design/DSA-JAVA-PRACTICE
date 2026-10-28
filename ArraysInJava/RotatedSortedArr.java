package ArraysInJava;

public class RotatedSortedArr {
  public static int search(int[] A, int target){
    int stt = 0;
    int end = A.length - 1;
    while(stt <= end){
    int mid = stt + (end - stt) / 2;
    if(A[mid] == target){
      return mid;
    } else if (A[stt] <= A[mid]){ // left sorted 
      if(A[stt] <= target && target < A[mid]){
        end = mid - 1;
      } else {
        stt = mid + 1;
      }

    } else { // right sorted
      if(A[mid] < target && target <= A[end]){
        stt = mid + 1;
      } else {
        end = mid - 1;
      }
    }
  }
  return -1;
}
  public static void main(String[] args) {
    int [] A = {4,5,6,7,0,1,2};
    int target = 0;
    System.out.println(search(A, target));
  }
}
