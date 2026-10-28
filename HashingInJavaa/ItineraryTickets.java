package HashingInJavaa;
import java.util.*;

public class ItineraryTickets {
  public static String getStart(HashMap<String, String> tickets){
    HashMap<String, String> revMap = new HashMap<>();

    for(String key : tickets.keySet()){
      revMap.put(tickets.get(key), key);   8u
    }

    for(String key : tickets.keySet()){
      if(!revMap.containsKey(key)) return key; // starting point
    }
    return null;
  }
  public static void main(String[] args) {
    HashMap<String, String> tickets = new HashMap<>();  
    tickets.put("chennai", "boomai");
    tickets.put("bangalore", "chennai");
    tickets.put("bangalore", "delhi");
    tickets.put("bangalore", "bangalore");

    String start = getStart(tickets);
    System.out.print(start);
    for(String key : tickets.keySet()){
      System.out.print("->" + key + " -> " + tickets.get(key));
    }
    
  }
}
