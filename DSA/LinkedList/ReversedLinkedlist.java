import java.util.*;

class Linkedlist{
    Node head;
    private int size;

    LinkedLists(){
        this.size = 0;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first, last;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //print list 
    public void printlist(){
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> " );
            currNode = currNode.next;
        }

        System.out.println("Null");
    }

    //delete first 
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last 
    public void deletelast(){
        if ( head == null){
            System.out.println("The list is empty");
            return;
        }

        size--;
        if (head.next == null){
            head = null;
            return;
        }

        Node secondlast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public int getsize(){
        return size;
    }


    public void reverseIterate() {

        if(head == null || head.next == null){
            return;
        }

        Node perviousNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = perviousNode;

            //Update 
            perviousNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = perviousNode;
    }

    public Node reveseRecursive(Node head) {
       if(head == null || head.next == null){
        return head;
       }
        Node newHead = reveseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        
        //Reverse a Linke List, No extra memoery should be used
        //Time complexity should be O(n)

        //using Iteration:
        Linkedlist list = new Linkedlist();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printlist();

        //list.reverseIterate();

        //Recursion:

        list.head =list.reveseRecursive(list.head);
        list.printlist();



    }
}