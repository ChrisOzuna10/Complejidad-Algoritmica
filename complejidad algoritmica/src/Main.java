import models.MissingNumberLinearSum;
import models.MissingNumberLinearXOR;
import models.MissingNumberLogLinear;
import models.MissingNumberQuadratic;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 3, 7, 8};
        int n = 8;

        // Modelo 1: Complejidad O(n^2)
        MissingNumberQuadratic quadratic = new MissingNumberQuadratic();
        System.out.println("Modelo O(n^2) - El número faltante es: " + quadratic.findMissingNumber(nums, n));

        // Modelo 2: Complejidad O(n log n)
        MissingNumberLogLinear logLinear = new MissingNumberLogLinear();
        System.out.println("Modelo O(n log n) - El número faltante es: " + logLinear.findMissingNumber(nums, n));

        // Modelo 3: Complejidad O(n) con Suma Gaussiana
        MissingNumberLinearSum linearSum = new MissingNumberLinearSum();
        System.out.println("Modelo O(n) Suma Gaussiana - El número faltante es: " + linearSum.findMissingNumber(nums, n));

        // Modelo 4: Complejidad O(n) con XOR
        MissingNumberLinearXOR linearXOR = new MissingNumberLinearXOR();
        System.out.println("Modelo O(n) XOR - El número faltante es: " + linearXOR.findMissingNumber(nums, n));
    }
}
