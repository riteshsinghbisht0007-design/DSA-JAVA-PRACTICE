package StacksInJava;
import java.util.*;

public class PalindroneLL {

  public static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  public static Node head;
  public static boolean isPalindrome(Node head){
     Stack<Integer> stack = new Stack<>();
     Node temp = head;

     // push all elements 
     while(temp != null){
       stack.push(temp.data);
       temp = temp.next;
     }
     // compare 
     temp =head;
     while(temp != null){
      if(temp.data != stack.pop()){
        return false;
      }
      temp = temp.next;
     }
     return true;
  }
  public static void main(String[] args) {
    PalindroneLL ll = new PalindroneLL();
    ll.head = new Node(1);
    ll.head.next = new Node(2);
    ll.head.next.next = new Node(3);
    ll.head.next.next.next = new Node(2);
    ll.head.next.next.next.next = new Node(1);
    System.out.println(isPalindrome(ll.head));
  }
}
