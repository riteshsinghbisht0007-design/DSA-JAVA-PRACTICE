package RecursionBasics;

public class AllTheOccurrences {

  public static void printAllOccurrences(int arr[], int n, int key , int index) {
    // int n = arr.length;
      // for (int i = 0; i < n; i++) {
      //   if (arr[i] == key) {
      //     System.out.print (i + " ");
      //   }
      // }
      

      // Using Recursion 
      
      // Base case 
      if(index == n){
        return;
      }

      // Check current element 
      if(arr[index] == key){
        System.out.print(index + " ");
      }
      // call for next element 
      printAllOccurrences(arr, n, key, index + 1);
      }
  
  public static void main(String[] args) {
    int arr[] = {3,2,4,5,6,2,7,2,2};
    int key = 2;
    int n = arr.length;
    printAllOccurrences(arr, n, key, 0);
  }
}
