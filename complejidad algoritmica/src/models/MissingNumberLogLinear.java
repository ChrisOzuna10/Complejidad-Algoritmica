package models;

import java.util.Arrays;

public class MissingNumberLogLinear {
    public int findMissingNumber(int[] nums, int n) {
        Arrays.sort(nums);
        for (int i = 1; i <= n; i++) {
            if (Arrays.binarySearch(nums, i) < 0) {
                return i;
            }
        }
        return -1; // Si no se encuentra el número faltante
    }
}
