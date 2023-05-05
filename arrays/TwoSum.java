package arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 11, 15, 7 };
        int tar = 9;
        int[] ans = twoSumIndices(arr, tar);
        System.out.println(Arrays.toString(ans));
    }

    /*
     * Brute - force approach
     * Time Complexity - O(n)
     * Space Complexity - O(1)
     */
    static int[] twoSumIndices(int[] arr, int tar) {
        int[] ans = { -1, -1 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == tar) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
