import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    
    public static void main(String[] args) {
       //Creating
       HashSet<Integer> set = new HashSet<>();
       //Same syntax as of ArrayList

       //Insert:
       set.add(1);
       set.add(2);
       set.add(3);
       set.add(1);
       
        //Size 
        System.out.println("The Size of Set is " + set.size());

        //Print all element 
        System.out.println(set);

       //Search - Special function called Contains
       if(set.contains(1)){
        System.out.println("Set Contains 1");
       }

       if(!set.contains(6)){
        System.out.println("It does not conatin 6");
       }

       //Delete -- Remove function

       set.remove(1);
       if(!set.contains(1)){
        System.out.println("We deleted 1");
       }

       //Iterator
       Iterator it = set.iterator();

       //hasNext and Next function:

       //Next --> it will return next value in the set 
       //hasNext --> return true or false, if the set has any next value than it
       //            will return true else it will return false

       while(it.hasNext()){
        System.out.println(it.next()); //Function will automatically update the value of "it"
                                       //No need to write "i++" or something like that.
        
       }
    }
}
