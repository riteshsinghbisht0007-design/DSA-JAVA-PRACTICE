package StacksInJava;

import java.util.Stack;

public class decodeStringInjava {
  public String decodeString(String s) {
        Stack<Integer> ns = new Stack<>();
        Stack<String> ss = new Stack<>();
        
        // num and str initialize to zero
        int num = 0;
        String str = "";

        // traverse the string 
        for(char ch : s.toCharArray()){
            if(ch >= '0' && ch <= '9'){
                num = num*10 + (ch - '0');

                // condition to check if num is not zero
                // if [  appears then num = 0

            } else if(ch == '['){
             ns.push(num);
             ss.push(str);

             num = 0;
             str = "";

             // condition to check if ] appears
            } else if(ch == ']'){
                int n = ns.pop();
                String old = ss.pop();
                String temp = "";
                
                // multiply str with n
                for(int i=0; i<n;i++){
                    temp += str;

                }

                // add old and temp
                str = old + temp;
            }
            else {
                str += ch;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String str = "3[a]2[bc]";
        System.out.println(new decodeStringInjava().decodeString(str));
    }
}
