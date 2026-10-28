package GreedyAlgorithm;
import java.util.*;
public class JobSequencing {
  static class Job {
    int deadline;
    int profit;
    int id;  // 0(A),

    public Job(int d, int p, int i) {
      deadline = d;
      profit = p;
      id = i;
    }
  }
  public static void main(String[] args) {
    int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

    ArrayList<Job> jobs = new ArrayList<>();

    for(int i=0; i<jobsInfo.length; i++){
    jobs.add(new Job(jobsInfo[i][0], jobsInfo[i][1], i));
    }

    // descencding order of profit
    
    // Collections.sort(jobs, Comparator.comparingInt(o -> o.profit).reversed());
    Collections.sort(jobs, (a,b) -> b.profit - a.profit);

    
    
    ArrayList<Integer> seq = new ArrayList<>();
    int time = 0;
    for(int i=0; i<jobs.size(); i++){
      if(jobs.get(i).deadline > time){
        seq.add(jobs.get(i).id);
        time++;
      }
    }

    // print sequence of jobs 
    for(int i=0; i<seq.size(); i++){
      System.out.print(seq.get(i) + " " );
    }
  }
}
