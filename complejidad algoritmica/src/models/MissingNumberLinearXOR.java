package models;

public class MissingNumberLinearXOR {
    public int findMissingNumber(int[] nums, int n) {
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < nums.length; i++) {
            xor1 ^= nums[i];
        }

        for (int i = 1; i <= n; i++) {
            xor2 ^= i;
        }

        return xor1 ^ xor2;
    }
}
