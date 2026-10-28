package StacksInJava;
import java.util.Stack;

public class NextGreaterElement {
  public static void main(String[] args) {
    int arr[] = {7,9,5,4,3,8 };
    Stack<Integer> s = new Stack<>();
    int nxtGreater[] = new int[arr.length];

    for(int i=arr.length-1; i>=0;i--){
      // while
      while(!s.isEmpty() && s.peek() <= arr[i]){
        s.pop();
      }

      // if else
      if(s.isEmpty()){
        nxtGreater[i] = -1;
      }else{
        nxtGreater[i] = s.peek();
      }

      // push in stack
      s.push(arr[i]);
    }

    for(int i=0; i<nxtGreater.length;i++){
      System.out.print(nxtGreater[i] + " ");
    }

  }
}
