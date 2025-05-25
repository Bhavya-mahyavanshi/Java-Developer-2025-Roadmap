import java.util.*;

class Questions{

    public static void main(String[] args) {
        
        /*Question 1: Make a linked list & add following elements to it
         * Search for the number seven 7 & display its index.
        */

        /*LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(1);
        list1.add(5);
        list1.add(7);
        list1.add(3);
        list1.add(8);
        list1.add(2);
        list1.add(3);

        for(int i = 0; i < list1.size(); i++){
            if(list1.get(i) == 7){
                System.out.println(i);
            }
        }*/

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Total number of elements: ");
        int lgth = sc.nextInt();

        for(int i = 0; i < lgth; i++){
            System.out.print("Enter the " + (i+1) +" value: ");
            int num = sc.nextInt();
            list2.add(num);
        }

        for(int i = 0; i < list2.size(); i++){
            int temp = list2.get(i);
            if( temp > 25){
                list2.remove(i);
                i--;
            }
        }

        System.out.println(list2);
    }
}