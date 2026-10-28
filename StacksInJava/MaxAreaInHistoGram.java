package StacksInJava;

import java.util.Stack;

// optimize code 
// Time complexity: O(n) 
// Space complexity: O(n)


public class MaxAreaInHistoGram {
  public static void maxArea(int arr[]){
    int maxArea = 0;
    int nsr[] = new int[arr.length]; // next smaller element on the right
     
    Stack<Integer> s = new Stack<>();
    for(int i= arr.length-1; i>=0; i--){
      while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
        s.pop();
      }
      if(s.isEmpty()){
        nsr[i] = arr.length;
      } else {
        nsr[i] = s.peek();
      }
      s.push(i);
    }



    int nsl[] = new int[arr.length]; 
    // next smaller element on the left
    s = new Stack<>();
    for(int i=0; i<arr.length; i++){
      while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
        s.pop();
      }
      if(s.isEmpty()){
        nsl[i] = -1;
      } else {
        nsl[i] = s.peek();
      }
      s.push(i);
    }


    // calculate the area for each bar in the histogram
    // curernt area = height * width

    for(int i=0; i<arr.length; i++){
      int height = arr[i];
      int width = nsr[i] - nsl[i] - 1;
      int area = height * width;
      maxArea = Math.max(maxArea, area);
    }
    System.out.println("Maximum area in histogram is: " + maxArea);

  }
  public static void main(String[] args) {
    int arr[] = {2,1,5,6,2,3};
    maxArea(arr);
  }
}
