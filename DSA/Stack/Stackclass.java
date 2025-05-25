import java.util.*;
public class Stackclass{

    //Using Linked List to implement stack
    /*static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    static class Stack{
        public static Node head;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.val;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return head.val;
        }
    }*/

    //Using ArrayList to implement stack

    /*static class Stack{
       static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
           return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return list.get(list.size() -1);
        }
    }*/


    


    public static void main(String[] args) {
       //Stack s = new Stack();

       //Using java colletion framework to implement stack..
       Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}