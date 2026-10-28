package BackTracking;

public class KnightsTour {
  public static void knightTour(int board[][], int row, int col){
    
    // base case 
    if(row == board.length){
      printBoard(board);

    }
  }
  public int isValid(int [][] board, int r, int c, int n, int expVal){



      // 8 possible moves 
      int ans1 = isValid(board, r-2, c+1, n, expVal+1);
      int ans2 = isValid(board, r-1, c+2, n, expVal+1);
      int ans3 = isValid(board, r+1, c+2, n, expVal+1);
      int ans4 = isValid(board, r+2, c+1, n, expVal+1);
      int ans5 = isValid(board, r+2, c-1, n, expVal+1);
      int ans6 = isValid(board, r+1, c-2, n, expVal+1);
      int ans7 = isValid(board, r-1, c-2, n, expVal+1);
      int ans8 = isValid(board, r-2, c-1, n, expVal+1);
    }
  public static void printBoard(int board[][]){
    System.out.println("---------Chess Board--------");
    for(int i=0; i<board.length;i++){
      for(int j=0; j<board.length;j++){
        System.out.println(board[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int n = 4;
    int board[][] = new int[n][n];

    // intialize 
    for(int i=0; i<=n;i++){
      for(int j=0; j<=n; j++){
        board[i][j] = 0;

      }
    }
    knightTour(board,0);
  }
}
