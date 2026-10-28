package RecursionBasics;

public class CheckSorting {
  public static boolean isSortec(int arr[], int i) {
    
    if (arr[i] > arr[i + 1]) {
      return false;
    }
    return isSortec(arr, i + 1);
  }
  public static void main(String[] args) { 
    int arr[] = { 6,8,9,5,19,21,2,3,1,5};

    System.out.println(isSortec(arr, 0)); 
    }
}
