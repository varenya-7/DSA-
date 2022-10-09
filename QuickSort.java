package Sorting;

public class QuickSort {
    public static int partition(int arr[], int low, int high){
        int pivot=arr[high];
        int i=low-1;  //Keeps track of the index of the pivot

        for (int j = low; j < high ; j++) {
        if(arr[j] < pivot){
            i++;
            int temp=arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
        }
        }
        //Elements before the pivot are placed now to get the index of the pivot
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i; //return the index of the pivot
    }
    public static void quickSort(int[] arr, int low, int high){
        //Quick Sort only works if the [low < high]
        if(low < high) {
            int pivot = partition(arr, low, high); //Using the partition function we find the index of the pivot
            //applying Quick sort from recursion on left subarray until it gets sorted
            quickSort(arr,low,pivot-1);
            //applying Quick sort from recursion on right subarray until it gets sorted
            quickSort(arr,pivot+1,high);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int l=0;
        int h=arr.length-1;
        quickSort(arr,l,h);
        //Printing the Array after it gets sorted\
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length-1)
            System.out.print(arr[i]+" , ");
            else
                System.out.println(arr[i]+" ");
        }
    }
}
