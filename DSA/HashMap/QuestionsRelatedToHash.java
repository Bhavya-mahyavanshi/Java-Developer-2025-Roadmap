import java.util.*;

public class QuestionsRelatedToHash {
    public static String getStart(HashMap<String, String> tick){
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : tick.keySet()){
            //Key --> key; val --> tick.get(key)
            revMap.put(tick.get(key), key);
        }

        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        /*
         * Question 1: Majority Element
         * Given an integer array of size n, find all elements that appear more 
         * than [n/3] times.
         * 
         * NOTe: The freq. need to be greater than [n/3] not equal.
         * 
         * --- 1 ---
         * nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1}; where n = 9 (not given but number of elem in array) 
         * 
         * --- 2 ---
         * nums[] = {1, 2};
         */

        //int num[] = {1, 3, 2, 5, 1, 3, 1, 5, 1}; //---1---
        int num[] = {1,2}; //---2---
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : num){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int freq = num.length / 3;

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() > freq){
                System.out.print(e.getKey() + " ");
            }
        }
        System.err.println();

        /*
         * Question 2: Union of 2 Arrays
         * arr1 = {7,3,9};
         * arr2 = {6,3,9,2,9,4};
         * 
         * union = (7,3,9,6,2,4) == 6 <-- Number of elements <--- Expected output
         */

        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println("Length of Union: " + set.size());

        /*
         * Question 3: Intersection of 2 Array
         * 
         * arr1 = {7,3,9}
         * arr2 = {6,3,9,2,9,4}
         * 
         * Intersection = 2 (3,9) --> return the length of intersection 
         */

        Set<Integer> set1 = new HashSet<>();
        int count = 0;

        int arr3[] = {7,3,9};
        int arr4[] = {6,3,9,2,9,4};

        for(int i = 0; i < arr3.length;i++){
            set1.add(arr3[i]);
        }

        for(int i = 0; i < arr4.length; i++){
            if(set1.contains(arr4[i])){
                count++;
                set1.remove(arr4[i]);
            }
        }

        System.out.println("Length of Intersection: "+ count); 
        
        /*
         * Question 4: Find Itinerary from Tickets [Was asked in Microsoft & Ola]
         * 
         * Example: "Chennai" --> "Bengaluru"
         *          "Mumbai" --> "Delhi"
         *          "Goa" --> "Chennai"
         *          "Delhi" --> "Goa"
         * 
         * Expected output: "Mumabi" --> "Delhi" --> "Goa" --> "Chennai" --> "Benagluru"
         */

        HashMap<String, String> tickets = new HashMap<>();;
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        //Function is on top to get the start:
        
        String start = getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.print(start + " --> ");
            start = tickets.get(start);
        }
        System.out.print(start);

        System.out.println();

        /*
         * Question 5: Subarray sum equal to K [Amazon, Microsoft]
         * 
         * arr1 = {1,2,3} k = 3  return number of such subarrays
         * ans = 2 --> (1,2) (3)
         */
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;

        map1.put(0, 1); //Empty subarray 
        int ans = 0;
        int sum = 0;
        for(int j = 0; j < arr.length; j++){
            sum += arr[j];

            if(map1.containsKey(sum-k)){
                ans += map1.get(sum-k);
            }

            if(map1.containsKey(sum)){
                map1.put(sum, map1.get(sum) + 1);
            }else{
                map1.put(sum, 1);
            }
        }

        System.out.println("Anwer: " + ans);
    }
}
