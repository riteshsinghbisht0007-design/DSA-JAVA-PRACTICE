package TwoDimension;

import java.util.Scanner;

public class Matrices {
  public static boolean search(int matrix [][], int key){
    for(int i=0; i<matrix.length;i++){
      for(int j=0; j<matrix[0].length;j++){
        if(matrix[i][j] == key){
          System.out.println("Found at (" + i + "," + j + ")");
          return true;
        }
      }
    
    }
    System.out.println("key not found");
    return false;
  }
  public static void printMax(int matrix [][]){
    int max = matrix[0][0];
    for(int i=0; i<matrix.length;i++){
      for(int j=0; j<matrix[0].length;j++){
        if(matrix[i][j] > max){
          max = matrix[i][j];
        }
      }
    }
    System.out.println(max);

  }
  public static void printMin(int matrix [][]){
    int min = matrix[0][0];
    for(int i=0; i<matrix.length;i++){
      for(int j=0; j<matrix[0].length;j++){
        if(matrix[i][j] < min){
          min = matrix[i][j];
        }
      }
    }
    System.out.println(min);
  }
  public static void main(String[] args) {
    int matrix [][] = new int [3][3];
    int n = 3, m =3;
    // n = matrix.length;
    // m = matrix[0].length;

    Scanner sc = new Scanner(System.in);
    for(int i=0; i<n;i++){
      for(int j=0; j<m;j++){
        matrix[i][j] = sc.nextInt();
      }
    }
    // output 
    for(int i=0; i<n;i++){
      for(int j=0; j<m;j++){
        System.out.println(matrix[i][j] + " ");
        
      }
      System.out.println();
     
    }

    
    System.out.println("Max is: " );
    printMax(matrix);
    System.out.println("Min is: " );
    printMin(matrix);
    search(matrix, 6);
     
  }
}
