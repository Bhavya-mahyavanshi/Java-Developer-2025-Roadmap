public class MergeSortAndQuickSort {

    //Merge sort: 

    /*public static void conquer(int arr[], int si, int mid, int ei){
       
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }

        while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }

        for(int i = 0, j = si; i < merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[], int si, int ei){

        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }*/

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++){
            if(arr[j]< pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i; //pivot index
    }

    public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }
    public static void main(String[] args) {

       
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        //Merge Sort:
        /*divide(arr, 0, n-1);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();*/

        //Quick Sort:

        quickSort(arr, 0, n-1);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
