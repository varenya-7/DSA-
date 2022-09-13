/*QUESTION
Given a characters array letters that is sorted in non-decreasing order and a character target,
return the smallest character in the array that is larger than target.
For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.

CASE-1
Input: letters = ["c","f","j"], target = "a"
Output: "c"

CASE-2
Input: letters = ["c","f","j"], target = "c"
Output: "f"

CASE-3
Input: letters = ["c","f","j"], target = "d"
Output: "f"
*/



class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int start=0;
        int end= arr.length-1;
         boolean isAsc=arr[start] < arr[end];
        while(start<=end){
            int mid= start + (end-start) / 2;
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
      
        return arr[start % (arr.length)]; //  if the element is at the last so we can return the 0th index
    }
    }
