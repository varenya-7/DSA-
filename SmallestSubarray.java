package Arrays;

/*Problem Statement
Given an array arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the minimum sum and return its sum

CASE-1
Input:
arr[] = {3,-4, 2,-3,-1, 7,-5}
Output: -6
Explanation: sub-array which has smallest
sum among all the sub-array is {-4,2,-3,-1} = -6

Case-2
Input:
arr[] = {2, 6, 8, 1, 4}
Output: 1
Explanation: sub-array which has smallest
sum among all the sub-array is {1} = 1
 */


import java.util.*;

public class SmallestSubarray
{
public static int findSmallestSum(int arr[]){

    int maxVal=Integer.MAX_VALUE;
    int minVal=Integer.MAX_VALUE;

    for(int i=0;i<arr.length;i++) {
        if (maxVal > 0) {
            maxVal = arr[i];
        } else {
            maxVal += arr[i];
            minVal = Math.min(minVal, maxVal);

        }

    }
return minVal;
 }
    public static void main(String[] args) {
        int arr[] = {3, -4, 2, -3, -1, 7, -5};
        System.out.print("Smallest sum: "
                + findSmallestSum(arr));

    }
}
