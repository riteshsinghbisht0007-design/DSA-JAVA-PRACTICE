package HeapsInJava;

public class WeakestSoldier {
  static class Row implements Comparable<Row> {
    int soldiers;
    int idx;
    public Row(int soldiers, in t idx) {
      this.soldiers = soldiers;
      this.idx = idx;
    }

    @Override 
    public int compareTo(Row r2) {
      if(this.soldiers == r2.soldiers) {
        return this.idx - r2.idx;
      } else {
        return this.soldiers - r2.soldiers;
      }
    } 
  }
  public static void main(String[] args) {
    int army[][] = {{1,0,0,0,0},
                    {1,1,1,1,1},
                    {1,0,0,0,0},
                    {1,0,0,0,0},
                    {1,0,0,0,0}};
  }
}
