package TwoDimension;
public class SearchSortedmatrix {

  public static void StairCaseSearch(int matrix[][], int key) {
    int row = 0;
    int col = matrix[0].length - 1;
    int count = 0;

    while(row<matrix.length && col >= 0){
      if(matrix[row][col] == key){
         count++;
      }else if(matrix[row][col] > key){
        col--;
      }else{
        row++;
      }
    }

    System.out.println(count);
  
  }
  public static void main(String[] args) {
    int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,29,50}};
    int key = 29;
   StairCaseSearch(matrix, key);
  }
}
