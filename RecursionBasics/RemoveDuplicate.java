package RecursionBasics;

public class RemoveDuplicate {
   public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
    if(idx == str.length()){
        System.out.println(newStr);
        return;
    }

    // Kaam
    char currChar = str.charAt(idx);
    if(map[currChar - 'a'] == true){
      // Duplicates 
        removeDuplicates(str, idx+1, newStr, map);
    } else {
      // Unique
      map[currChar - 'a'] = true;
     
      removeDuplicates(str, idx+1, newStr.append(currChar), map);
    }
   }
   public static void main(String[] args) {
    String str = "apnacollege";
    removeDuplicates (str, 0, new StringBuilder(""), new boolean[26]);
   }
}
