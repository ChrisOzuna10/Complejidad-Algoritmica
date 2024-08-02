package models;

public class MissingNumberQuadratic {
    public int findMissingNumber(int[] nums, int n) {
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1; // Si no se encuentra el número faltante
    }
}
