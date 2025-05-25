import java.util.ArrayList;
import java.util.Collections;

class test {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        //add element 

        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get element

        int element = list.get(0);
        System.out.println(element);

        //To add element in between 

        list.add(1,1);
        System.out.println(list);

        //Set Element

        list.set(0, 5);
        System.out.println(list);

        //Delete element

        list.remove(3);
        System.out.println(list);

        //count the length

        int size = list.size();
        System.out.println(size);

        //loops
        
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting 

        Collections.sort(list);
        System.out.println(list);
    }
}