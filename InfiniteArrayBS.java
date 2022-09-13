/*Find the element in a Infinite Array using the index to find the length of the array 

[HINT- take a small range of 2 with {start=0 and end= 1} then increase the value of {start= end + 1  && end = previousEnd + (end - start + 1)*2 }
Apply Binary search]
*/


package Arrays;

public class InfiniteArrayBS {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170,189,1222,1566,1600,1780,1800,1801,1802};
        int target = 130;
        System.out.println(findingAnswerInRange(arr, target));
    }
    static int findingAnswerInRange(int arr[],int target){
        int start=0;
        int end=1;
        while(target > arr[end]){
            int tmp= end + 1; //new Start position
            end= end + (end - start + 1) * 2;
            start=tmp;

        }
       return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target ,int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
