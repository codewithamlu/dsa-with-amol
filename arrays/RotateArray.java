package arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;
        rotateUsingTemp(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    /*
     * Brute - force approach
     * Make temp array of size k and store first k+1 elements in it
     * Shift last k elements to as per rotation to start of array
     * At last, elements from temp in arr starting from n-k position of arr by x=0
     * position of temp
     * 
     * Time Complexity - O(n)
     * Space Complexity - O(k)
     */
    static void rotateUsingTemp(int[] arr, int k) {
        int n = arr.length - 1;
        int[] temp = new int[k + 1];
        for (int i = 0; i < k + 1; i++) {
            temp[i] = arr[i];
        }
        int x = k + 1;
        for (int i = 0; x <= n; i++) {
            arr[i] = arr[x++];
        }
        x = 0;
        for (int i = n - k; i <= n; i++) {
            arr[i] = temp[x++];
        }
    }

    static void rotate(int[] arr, int k) {

    }
}
