import java.util.*;

class Hashmap{
    public static void main(String[] args) {
        //country(key), Population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);

        System.out.println(map);

        //Try to add the key that already exists 
        map.put("China", 160);
        System.out.println(map);

        //Search operation OR Look up operation

        if(map.containsKey("Europe")){
            System.out.println("Present in the map");
        }else{
            System.out.println("Key is not present");
        }

        //Get function
        System.out.println(map.get("China"));//Key exists
        System.out.println(map.get("Europe"));//Not exists

        //Different for loop for collection
        int arr[] = {12, 15, 18};

        for(int i = 0; i < 3; i++){ //Regular for loop 
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int val : arr){ //For loop for collections
            System.out.print(val +" ");
        }
        System.out.println();

        //Uisng second type of for loop we will use to iterate HashMap
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey() + " ");
            System.out.print(e.getValue());
            System.out.println();
        }

        //Second method to iterate HashMap

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        //Remove any key
        map.remove("China");
        System.out.println(map);
    }
}