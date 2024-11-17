/*
 * Given an array of positive integers arr[], return the second largest element from the array. 
 * If the second largest element doesn't exist then return -1.
 * Note: The second largest element should not be equal to the largest element.
 * 
 * Examples:
 * Input: arr[] = [12, 35, 1, 10, 34, 1]
 * Output: 34
 * Explanation: The largest element of the array is 35 and the second largest element is 34.
 * 
 * Input: arr[] = [10, 5, 10]
 * Output: 5
 *  Explanation: The largest element of the array is 10 and the second largest element is 5.
 * 
 * Input: arr[] = [10, 10, 10]
 * Output: -1
 * Explanation: The largest element of the array is 10 and the second largest element does not exist.
 * 
 *  Constraints:
 * 2 ≤ arr.size() ≤ 105
 * 1 ≤ arr[i] ≤ 105
 * 
 */
class Solution{
    public static void main(String[] args) {
        // int[] arr = {12, 35, 1, 33, 32};
        int[] arr = {10, 5, 10};
        // int[] arr = {10, 10, 10};
        System.out.println(new Solution().getSecondLargest(arr));
    }
    public int getSecondLargest(int[] arr) {
        int max1=-1;
        int max2=-1;

        for(int i=0;i<arr.length;i++){
            if(max1 < arr[i]){
                max2=max1;
                max1=arr[i];
            }
            else if(max1 > arr[i] && arr[i] > max2){
                max2=arr[i];
            }
        }   
        return max2; 
    }
    public int getSecondLargest1(int[] arr) {
        // Code Here
        // 1st Iteartion for 1st Maximum 
        int max1=arr[0]; 
        for(int i=0;i<arr.length;i++){
            if(max1 < arr[i]){
                max1=arr[i]; 
            }
        }
        // 2st Iteartion for 2nd Maximum 
        int max2=0; // 12
        int f=0;
        for(int i=0;i<arr.length;i++){
            if(max2 < arr[i] && arr[i]!=max1){
                f=1;
                max2=arr[i]; 
            }
        }
        if(f==0){
            return -1;
        }
        return max2;
    }
}
