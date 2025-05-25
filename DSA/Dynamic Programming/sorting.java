import java.util.Scanner;
import java.util.Array;

class test{

    public static void printarr(int arr[]){
        for(int i =0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        int arr[] = {7,8,3,1,2};
        
        //Time complexity = O(n^2)
        //Bubble sort 
        
        /*for(int i=0;i<arr.length-1; i++){ //n-1 iteration
            for(int j=0; j<arr.length-i-1; j++){ 
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }

        printarr(arr);*/

        //Selection Swap
        //time complexity = O(n^2)
        
        /*for(int i = 0; i<arr.length-1;i++){//n-1 times 
            int smll = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smll]>arr[j]){
                    smll = j;
                }
            }
            int temp = arr[smll];
            arr[smll] = arr[i];
            arr[i]=temp;
        }
        printarr(arr);*/

        //Insertion sort
        //Time complexity = O(n^2)

        for(int i = 0; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current< arr[j]){
                arr[j+1]=arr[j];
                j--;
            }

            //Placement 
            arr[j+1]=current;
        }
        printarr(arr);
    }
}