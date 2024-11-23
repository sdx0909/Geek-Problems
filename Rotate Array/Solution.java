// Rotate Array by difference 'd'
/*
 * Given an unsorted array arr[]. 
 * Rotate the array to the left (counter-clockwise direction) by d steps, 
 * where d is a positive integer. 
 * Do the mentioned change in the array in place.
 * Note: Consider the array as circular.
 * 
 * Examples :
 * Input: arr[] = [1, 2, 3, 4, 5], d = 2
 * Output: [3, 4, 5, 1, 2]
 * Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
 * 
 * Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
 * Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
 * Explanation: when rotated by 3 elements, 
 * it becomes 8 10 12 14 16 18 20 2 4 6.
 * 
 * Input: arr[] = [7, 3, 9, 1], d = 9
 * Output: [3, 9, 1, 7]
 * Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.
 * 
 * Constraints:
 * 1 <= arr.size(), d <= 105
 * 0 <= arr[i] <= 105
 */
public class Solution {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int d = 4; // 10 12 14 16 18 20 2 4 6 8
        rotateArr3(arr, d);
        // Displaying elements
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void rotateArr1(int arr[], int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d > n

        // Step 1: Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Step 2: Reverse the remaining elements
        reverse(arr, d, n - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    static void rotateArr2(int[] arr, int d) {
        int n = arr.length;
  
        // Repeat the rotation d times
        for (int i = 0; i < d; i++) {
          
            // Left rotate the array by one position
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }
    static void rotateArr3(int[] arr, int d) {
        int n = arr.length;

        // Handle case when d > n
        d %= n; // d = d % n
        
        // Storing rotated version of array
        int[] temp = new int[n];

        // Copy last n - d elements to the front of temp
        for (int i = 0; i < n - d; i++)
            temp[i] = arr[d + i];

        // Copy the first d elements to the back of temp
        for (int i = 0; i < d; i++)
            temp[n - d + i] = arr[i];

        // Copying the elements of temp in arr
        // to get the final rotated array
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }
}
