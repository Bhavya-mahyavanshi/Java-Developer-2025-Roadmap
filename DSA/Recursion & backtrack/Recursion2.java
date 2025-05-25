import java.util.Scanner;
import java.util.Array;
import java.util.HashSet;

class test{
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("Transfer disk "+ n + " from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void printrev(String str, int idx){

        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printrev(str, idx-1);
    }

    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element){

        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar == element){
            if (first == -1) {
                first = idx;
            }else{
                last = idx;
            }
        }

        findOccurance(str, idx+1, element);
    }

    public static boolean isSorted(int arr[], int idx){
        
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] >= arr[idx+1]){
            return false;
        }
        return isSorted(arr, idx+1);
    }

    public static void moveAllX(String str, int idx, int count, String newString){

        if(idx == str.length()){
           for(int i = 1; i <= count; i++){
            newString += 'x';
           }
           System.out.println(newString);
           return;
        }
        char currchar = str.charAt(idx);
        if(currchar == 'x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }else{
            newString += currchar;
            moveAllX(str, idx+1, count, newString);
        }
    }

    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString){
        
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currchar = str.charAt(idx);
        if(map[currchar - 'a']){
            removeDuplicates(str, idx+1, newString);
        }else{
            newString += currchar;
            map[currchar - 'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
    }

    public static void subsequences(String str, int idx, String newString){

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);

        //to be 
        subsequences(str, idx+1, newString+currchar);

        // or not to be
        subsequences(str, idx+1, newString);
    }

    public static void uniqsunseq(String str, int idx, String newString, HashSet<String> set){

        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currchar = str.charAt(idx);

        //to be 
        uniqsunseq(str, idx+1, newString+currchar, set);

        // or not to be
        uniqsunseq(str, idx+1, newString, set);
    }

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu", "vwx","yz"};

    public static void printComb(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currchar = str.charAt(idx);
        String mapping = keypad[currchar - '0'];

        for(int i = 0; i < mapping.length(); i++){
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args){

        //Qestion 1: TowerOfHanoi;
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");

        //Question 2: Print a string in revese
        /*String str = "abcd";
        printrev(str, str.length()-1);*/

        //Question 3: find first and last occurance in a string
        /*String str = "abaacdaefaah";
        findOccurance(str, 0, 'a');*/

        //Question 4: check if the array is sorted(Strictly increasing)
        /*int arr[] = {1,2,2};
        System.out.println(isSorted(arr, 0));*/

        //Question 5: move all x to the end of the string

        /*String str = "axbcxxd";
        moveAllX(str, 0, 0, "");*/

        //Question 6: remove duplicates from strings
        /*String str = "abbccda";
        removeDuplicates(str, 0, "");*/

        //Question 7: Print all the subsequences of a string
        /*String str = "abc";
        subsequences(str, 0, "");*/

        //Question 8: Print all unique the subsequences of a string
        /*String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqsunseq(str, 0, "",set);*/

        //Question 9: print keypad comination
        // String str = "4";
        // printComb(str, 0, "");
    }
}