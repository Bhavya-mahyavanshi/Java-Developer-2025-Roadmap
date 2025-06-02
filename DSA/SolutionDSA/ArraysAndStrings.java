import java.util.*;
/*
 * Before starting, Note that each problme will be solve 
 * by creating it own individual function, and if required 
 * the function will use in my problem.
 */

public class ArraysAndStrings{

    public static int findLargeElem(int[] arr){
        int i = 0;
        int max = -1;
        while(i <  arr.length){
            if(max < arr[i]){
                max = arr[i];
            }
            i++;
        }

        return max;
    }

    public static int[] reverse(int[] arr){
        int mid = arr.length / 2;
        int i = 0;
        while(i <= mid){
            int temp = arr[arr.length - i -1];
            arr[arr.length - i -1] = arr[i];
            arr[i] = temp;

            i++;
        }

        return arr;
    }

    public static void findSecond(int[] arr){
        Arrays.sort(arr);

        if(arr.length <= 4){
            System.out.println("There is no second element");
        }else{
            System.out.println("Second smallest: " + arr[1]);
            System.out.println("Second largest element: " + arr[arr.length - 2]);
        }
       
    }

    public static boolean isSorted(int[] arr){
        int idx = 0;
        while(idx < arr.length - 1){
            if(arr[idx] > arr[idx + 1]){
                return false;
            }
            idx++;
        }

        return true;
    }

    public static void moveZeros(int[] arr){
        int zeroCount = 0;
        int i = 0;
        ArrayList<Integer> newArr = new ArrayList<>();

        while(i < arr.length){
            if(arr[i] == 0){
                zeroCount++;
            }else{
                newArr.add(arr[i]);
            }
            i++;
        }

        while(zeroCount > 0){
            newArr.add(0);
            zeroCount--;
        }

        System.out.println(newArr);
    }

    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args){
        /*
         * Question 1: Find the largest element in an array.
         * 
         * Example: Array: [3, 17, 5, 9, 21, 4]
         *          Largest element: 21
         */

        int arr[] = {3, 17, 5, 9, 21, 4};
        System.out.print("The Largest Element is: " + findLargeElem(arr));
        System.out.println();

        /*
         * Question 2: Reverse an Array.
         * 
         * Example: Original Array: [10, 20, 30, 40, 50]
         *          Reversed Array: [50, 40, 30, 20, 10]
         */

        //We are reversing the same array.
        print(reverse(arr));
        System.out.println();

        /*
         * Question 3: Find the second largest and second smallest element.
         * 
         * Example: [12, 5, 8, 20, 3, 15]
         *           Second smallest: 5
         *          Second largest: 15
         */

        findSecond(arr);

        /*
         * Question 4: Check if an array is sorted.
         * 
         * @return: ture or flase
         */

        System.out.println("Is array Sorted: " + isSorted(arr));

        /*
         * Question 5: Move all Zeros to the end of the array.
         * 
         */

        int[] arr1 = {1, 0, 0, 2, 1, 0, 3, 5, 0};
        moveZeros(arr1);
    }
}