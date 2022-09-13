package Arrays;

public class CeilingNumber {

    static int findCeilingNumberUsingBS(int arr[], int target){
        int start=0;
        int end= arr.length-1;
         boolean isAsc=arr[start] < arr[end];
        while(start<=end){
            int mid= start + (end-start) / 2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target<arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,8,10,12,14,18};
        int target=16;
        int indexOfCeilingNumber=findCeilingNumberUsingBS(arr,target);
        System.out.println("Ceiling Number is:- "+arr[indexOfCeilingNumber]);
        System.out.println("Index of Ceiling Number:- "+indexOfCeilingNumber);
    }
}
