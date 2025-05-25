import java.util.*;

class LinkedLists{
    /*Node head;
    private int size;

    LinkedLists(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first, last;
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
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
    }*/

    public static void main(String[] args){
        /*LinkedLists list = new LinkedLists();
        list.addFirst("a");
        list.addFirst("is");
        list.printlist();

        list.addLast("List");
        list.printlist();

        list.addFirst("This");
        list.printlist();

        list.deleteFirst();
        list.printlist();

        list.deletelast();
        list.printlist();

        System.out.println(list.getsize());
        list.addFirst("This"); 
        System.out.println(list.getsize());*/

        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("List");
        list.addFirst("This");
        System.out.println(list);

        System.out.println(list.size());

        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " --> ");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}