import java.io.*;
public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static LinkedList insert(LinkedList list, int data){
        Node n = new Node(data);
        if (list.head == null){
            list.head = n;
        }
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = n;
        }
        return list;
    }
    public static void main(String[] args){

    }
}