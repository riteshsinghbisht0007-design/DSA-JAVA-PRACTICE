package OOPS;

public class Interfaces {
  public static void main(String[] args) {
    Queen q = new Queen();
    q.moves();

    King k = new King();
    k.moves();

    Knight kn = new Knight();
    kn.moves();
  }
}
interface ChessPlayer{
  void moves();

}

class Queen implements ChessPlayer
{
  public void moves(){
    System.out.println(" up, down, left, right, diagonal ");
  }
}

class Rook implements ChessPlayer
{
  public void moves(){
    System.out.println(" up, down, left, right ");
  }
}

class Bishop implements ChessPlayer
{
  public void moves(){
    System.out.println(" diagonal ");
  }
}

class Knight implements ChessPlayer
{
  public void moves(){
    System.out.println(" L shape ");
  }
}
class King implements ChessPlayer
{
  public void moves(){
    System.out.println(" up, down, left, right, diagonal by one step");
  }
}