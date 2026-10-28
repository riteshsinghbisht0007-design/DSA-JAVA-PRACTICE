package LEETCODE_Practice;
import java.util.Scanner;
public class LC2520 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
  int count = 0;
        while (num > 0){
            int dig = num % 10;
            if(num % dig == 0){
                count ++;

            }
            num = num / 10;

        }
        System.out.println(count);
        
            

    
    }
}