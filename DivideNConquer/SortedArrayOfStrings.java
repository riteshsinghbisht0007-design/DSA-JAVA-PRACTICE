package DivideNConquer;

public class SortedArrayOfStrings {

  public static void mergeSort(String[] arr, int si, int ei) {
    
    // base case 
    if(si >= ei) {
      return;
    }

    // kaam 
    int mid = si + (ei-si)/2;
    mergeSort(arr, si, mid); // left part 
    mergeSort(arr, mid+1, ei); // right part
    merge(arr, si, mid, ei);

  }

  public static void merge(String[] arr, int si, int mid, int ei) {
    
    String temp[] = new String[ei-si+1];
    int i = si;
    int j = mid+1;
    int k = 0;

    while(i <= mid && j<=ei) {
      if(arr[i].compareTo(arr[j]) < 0) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }

    // left part 
    while(i <= mid) {
      temp[k] = arr[i];
      i++;
      k++;
    }

    // right part
    while(j <= ei) {
      temp[k] = arr[j];
      j++;
      k++;
    }

    // copy temp to original array 
    for(int l=0; l<temp.length; l++) {
      arr[si+l] = temp[l];
    }
  }

  public static void printArray(String[] arr) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    String arr[] = {"sun", "earth", "mars", "mercury" };
    mergeSort(arr, 0, arr.length-1);
    printArray(arr);
  }
}
