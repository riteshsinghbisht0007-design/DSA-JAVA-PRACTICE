package LinkedListInJava;

import java.util.LinkedList;

public class MergeSort {

public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public Node head;
  public void print(){
    if(head == null){
      System.out.println("LL is empty");
      return;
    }
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }
  
  public Node getMid(Node head){
    Node slow = head;
    Node fast = head.next;

    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  private Node merge(Node left, Node right){
     Node mergedLL = new Node(-1);
     Node temp = mergedLL;

     Node leftHead = left;
     Node rightHead = right;

     while(leftHead != null || rightHead != null){
        if(leftHead.data <= rightHead.data){
          temp.next = leftHead;
          leftHead = leftHead.next;
          temp = temp.next;
        }else{
          temp.next = rightHead;
          rightHead = rightHead.next;
          temp = temp.next;
        }
     }

     while(leftHead != null){
      temp.next = leftHead;
      leftHead = leftHead.next;
      temp = temp.next;
     }

     while(rightHead != null){
      temp.next = rightHead;
      rightHead = rightHead.next;
      temp = temp.next;
     }

     return mergedLL.next;
  }
  public Node mergeSort(Node head){
    if(head == null || head.next == null){
      return head;
    }

    // find mid 
    Node mid = getMid(head);


    // left half & right half
    Node rightHead = mid.next;
    mid.next = null;

    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);


    // merge 
    return merge(newLeft, newRight);
  }
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    MergeSort ll = new MergeSort();
    ll.head = new Node(4);
    ll.head.next = new Node(2);
    ll.head.next.next = new Node(1);
    ll.head.next.next.next = new Node(3);
    
    System.out.println("Before sorting:");
    ll.print();

    ll.head = ll.mergeSort(ll.head);
    System.out.println("After sorting:");
    ll.print();
    

  

  }
}
