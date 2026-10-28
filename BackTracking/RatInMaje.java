package BackTracking;

public class RatInMaje {

  public static void helper(int maze[][], int r, int c, String path, String ans, boolean visited[][]) {

    // base case
    int n = maze.length;
    if(r<0 || c<0 || r>=n || c>=n || maze[r][c]==0 || visited[r][c]==true) {
      return;
    }
    if(r==n-1 && c==n-1) {
      System.out.println(path);
      return;
    }

    visited[r][c] = true;

    helper(maze, r+1, c, path+"D", ans, visited); // Down
    helper(maze, r-1, c, path+"U", ans, visited); // Up
    helper(maze, r, c+1, path+"R", ans, visited); // Right
    helper(maze, r, c-1, path+"L", ans, visited); // Left

    visited[r][c] = false;
  }
  
  public static void ratInMaze(int maze[][], int r, int c,  String ans) {
    
    int n = maze.length;
    boolean[][] visited = new boolean[n][n];
    String path = "";

    helper(maze,0,0,path,ans,visited );
  }
  
  public static void main(String[] args) {
    int maze[][] = {{1, 1, 0, 0},
    {1, 1, 1,0},
    {0, 1, 1, 0},
    {0, 1, 1, 1}};
    ratInMaze(maze, 0, 0, "");
  }
}
