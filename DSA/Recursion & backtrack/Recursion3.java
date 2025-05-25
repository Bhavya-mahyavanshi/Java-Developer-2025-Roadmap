import java.util.Scanner;
import java.util.Array;
import java.util.ArrayList;
import java.util.*;

class test{
     
    public static void printperm(String str, String permutation){

        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            printperm(newstr, permutation+currchar);
        }
    }

    public static int countPaths(int i, int j, int n, int m){
        
        if(i == n || j == m){
            return 0;
        }
        if( i == n-1 && j == m-1){
            return 1;
        }
        //move downwards
        int downPaths = countPaths(i+1, j, n, m);

        //move right
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths + rightPaths;
    }

    public static int placeTiles(int n, int m){

        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }

        //vertically
        int vertPlacements = placeTiles(n-m, m);

        //horizontal
        int horPlacements = placeTiles(n-1, m);

        return vertPlacements + horPlacements;
    }

    public static int callGuests(int n){
        if(n <= 1){
            return 1;
        }

        //single
        int ways1 = callGuests(n-1);

        //pair
        int ways2 = (n-1) * callGuests(n-2);

        return ways1 + ways2;
    }

    public static void printsubset(ArrayList<Integer> subset){
        for(int i = 0; i < subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer> subset){
         
        if(n == 0){
            printsubset(subset);
            return;
        }
        //add hoga 
        subset.add(n);
        findSubsets(n-1, subset);

        //add nahi hoga
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }

    public static void main(String[] args){

        //Question 1: Print all permuatation of a string 

        /*String str = "abc";
        printperm(str, "");*/

        //Question 2: count total path in a maze to move from (0,0) to (n,m)

        /*int n = 3, m = 3;
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);*/

        //Question 3: Place tiles of size 1*m in a floor of size n*m
        /*int n = 4, m = 2;
        int totalways = placeTiles(n, m);
        System.out.println(totalways);*/

        //Question 4: Find the number of ways in which you can invite n people 
        // to your party, single or in pairs
        /*int n = 4;
        System.out.println(callGuests(n));*/

        //Question 5: Print all the subsets of a set of all first n natural number
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();

        findSubsets(n, subset);


        
    }
}