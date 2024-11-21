// Peek-Element
/*
 * Given an 0-indexed array of integers arr[], find its peak element and return its index. 
 * An element is considered to be peak if its value is greater than or equal to the values of its adjacent elements (if they exist).
 * Note: The output will be "true" if the index returned by your function is correct; 
 * otherwise, it will be "false".
 * 
 * Examples :
 * 
 * Input: arr = [1, 2, 3]
 * Output: true
 * Explanation: If the index returned is 2, then the output printed will be 1.
 * Since arr[2] = 3 is greater than its adjacent elements, 
 * and there is no element after it, we can consider it as a peak element. 
 * No other index satisfies the same property, so answer will be printed as 0
 * 
 * Input: arr = [1, 1, 1, 2, 1, 1, 1]
 * Output: true
 * Explanation: In this case there are 5 peak elements with indices as {0,1,3,5,6}. 
 * Returning any of them will give you correct answer.
 * 
 * Input: arr = [1, 1, 1]
 * Output: true
 * Explanation: In this case, all elements are peak elements.
 * 
 * Constraints:
 * 1 ≤ arr.size() ≤ 106
 * 0 ≤ arr[i] ≤ 106
 */

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        System.out.println(peakElement(arr));
    }
    public static int peakElement(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(i==0){
                if(arr[i+1]<=arr[i]){
                    return i;
                }
            }
            if(i==n-1){
                if(arr[i-1] <= arr[i]){
                    return i;
                }
            }
            if(arr[i-1] <= arr[i] && arr[i+1] <= arr[i]){
                return i;
            }
        }
        return 0;
    }
}
