package Arrays;

public class PeakElementInMountainArray {
    public static void main(String[] args) {

        int[] arr={1,2,3,5,3,1,2,0};
        int resultIndex=peakIndexInMountainArray(arr);
        System.out.println("Index of Peak element:- "+resultIndex);

    }
    public static int peakIndexInMountainArray(int[] arr) {
         int start=0;
         int end=arr.length-1;

         while(start < end){
            int mid = start + (end - start) /2 ;
             if(arr[mid]>arr[mid+1]){
                 //Dec part of an Array
                 //this maybe the possible answer but check at the left side (that is why (end!=mid-1))
                 end=mid;
             }
             else{
               //as we are in the Increasing part of an Array
                 start=mid+1;
             }
         }
         return start; //You can also return end as both are equal
    }
}
