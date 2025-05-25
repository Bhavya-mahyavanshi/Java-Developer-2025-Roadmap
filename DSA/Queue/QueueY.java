import java.util.*;

public class QueueY {

    /*
    //Implementation of Queue from Array
   static class Queue {
    static int arr[];
    static int size;
    static int rear = -1;

    Queue(int n){
        arr = new int[n];
        this.size = n;
    }

    public static boolean isEmpty(){
        return rear == -1;
    }

    //add OR enqueue
    public static void add(int data){
        if(rear == size - 1){
            System.out.println("Full Queue");
            return;
        }

        rear++;
        arr[rear] = data;
    }

    //dequeue 
    public static int remove(){
        if(isEmpty()){
            System.out.println("The Queue id empty");
            return -1;
        }
        int front = arr[0];
        for(int i = 0; i < rear; i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("The Queue id empty");
            return -1;
        }
        
        return arr[0];
    }
   }
    */

   /* 
   //Implementation of Circular Queue from Array
   static class Queue{
    static int arr[];
    static int size;
    static int rear = -1;
    static int front = -1;

    Queue(int n){
        arr = new int[n];
        this.size = n;
    }

    public static boolean isEmpty(){
        return rear == -1 && front == -1;
    }

    public static boolean isFull(){
        return (rear + 1) % size == front;
    }

    public static void add(int data){
        if(isFull()){
            System.out.println("Full Queue");
            return;
        }

        if(front == -1){
            front = 0;
        }

        rear = (rear + 1)%size;
        arr[rear] = data;
    }

    public static int remove(){
        if(isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        }
        int result = arr[front];
        if(rear == front){
            rear = front = -1;
        }else{
            front = (front + 1)%size;
        }
        return result;
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        }

        return arr[front];
    }
   }
    */

    /* 
    //Implementation using Linked List
    static class Node{
        int val;
        Node next;

        Node(int data){
            this.val = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(tail == null){
                tail = head = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("The Queue is Empty");
                return -1;
            }

            int value = head.val;
            if(head == tail){
                tail = null;
            }
            head = head.next;
            
            return value;
        }

        public static int peek(){
             if(isEmpty()){
                System.out.println("The Queue is Empty");
                return -1;
            }

            return head.val;
        }

    }
    
    */

    public static void main(String[] args) {
       /*  Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek()); 
            q.remove();
        }
        */

        //Using Java Collection frame Work
        Queue<Integer> queue = new LinkedList<>(); //Can also be implemented with ArrayDeque
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        while(!queue.isEmpty()){
            System.out.println(queue.peek()); 
            queue.remove();
        }
    }
}
