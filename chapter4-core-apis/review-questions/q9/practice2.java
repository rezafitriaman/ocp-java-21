import java.util.Arrays;

public class practice2 {
    private static boolean conceptualArraysEquals(int[] a, int[] b) {
        // Conceptually if u do Arrays.equals(e, f), u do:
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    final public static void main(String args[]) {
        // Java arrays are zero-based (like most programming language)
        int[] arr = {10, 20, 30};
        System.out.println(arr[0]); // 10

        // Array are fixed size
        int[] arr2 = new int[3];
        System.out.println(Arrays.toString(arr2));

        // Aray is not immutable
        int[] arr3 = {1, 2, 3};
        arr[0] = 99; // allowed
        System.out.println(Arrays.toString(arr3));

        // equals() always return false
        // Because equals() for arrays behaves like:
        // return (this == other) - It compares memory addresses, NOT contents
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(a.equals(b)); // false
        System.out.println(a == b); // false

        int[] c = {1, 2, 3};
        int[] d = {2, 3, 4};
        System.out.println(c.equals(d)); // false
        System.out.println(c == d); // false

        int[] z = {1, 2, 3};
        int[] x = z; // This are the same object in momory
        System.out.println(x == z); // true
        System.out.println(x.equals(z)); // true

        // Array do NOT override equals()
        // They use default behavior from `Object`:
        // `==` --> compares reference
        // `equals()` --> SAME as `==`

        // If u want to compare contents
        int[] e = {4, 5, 6};
        int[] f = {4, 5, 6};
        Arrays.equals(e, f); // true

        // Conceptually Arrays.equals();
        System.out.println("Conceptually Arrays.equals(): " + conceptualArraysEquals(e, f));

        // Arrays.equals() is shallow and Arrays.deepEquals(a, b) is deep comparison
        int[] g[] = {{1, 2}, {3,4}};
        int h[][] = {{1, 2}, {3,4}};
        System.out.println("Arrays.deepEquals(): " + Arrays.deepEquals(g, h)); // true
    }
}