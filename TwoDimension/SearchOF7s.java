package TwoDimension;


public class SearchOF7s {
  public static int countOfseven(int mat[][]){
    int count = 0;
    for(int i = 0; i < mat.length; i++){
      for(int j = 0; j < mat[0].length; j++){
        if(mat[i][j] == 7){
          count++;
        }
      }
    }
    return count;
  } 
  public static void main(String[] args) {
    int mat[][] = {{4,7,8} , {7,8,8}};
    System.out.println(countOfseven(mat));
  }
}
