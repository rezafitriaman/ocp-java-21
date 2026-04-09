// Explaination
public class practice2 {
    final public static void main(String[] args) {
        // ASCII order:
        // NUMBERS - 1234
        // UPPERCASE - ABCD
        // LOWERCASE - abcd
    }
    // ### .compare() and .mismatch()
    private static void optionA() {
        String [] s1 = {"Camel", "Peacock", "Llama"};
        String [] s2 = {"Camel", "Llama", "Peacock"};
        // Option A: `compare(s1, s2)` - Returns Positive
        // Compare element by element:
        // Index 0: "Camel" vs "Camel" - equal, continue
        // Index 1: "Peacock" vs "Llama"
        // 'P' (80) vs 'L' (76) -> 'P' > 'L' -> FIRST array is GREATER (80 - 76 = 4)
        // Retruns: POSITIVE number (1)

        System.out.println(Arrays.compare(s1, s2)); // Return 1 (positive)
    }

     // ### mismatch(s1, s2)
     private static void optionB() {
        // First difference at index 1
         // Returns: 1 (positive integer)
     }

     // ### compare(s3, s4)
     private static void optionC() {
        String[] s3 = {"Camel" }; // length 1
        String[] s4 = {"Camel", null}; // length 2

        //Compare:
        // Index 0: "Camel" vs "Camel" -> equal
        // All elements of shorter arrays (s3) are equal to frist element of s4
        // s3 is shorter -> returns NEGATIVE (-1)
    }

    // ### mismatch(s3, s4)
    private static void optionD() {
        // Index 0: "Camel" vs "Camel" -> equal
        // s3 has no element at Index 1, but s4 does
        // Return: s3.length = 1 (positive)
    }

    // ### compare(s4, s4) - So the arrays are equal - If u compare it it Return 0
    private static void optionE() {
        // Same array reference
        // All elements equal (including null)
        // Return: 0 (arrays are equal)
    }

    // ### mismatch(s4, s4) - So the arrays are equal - NO mismatch it Return -1
    private static void optionF() {
        // Same array reference
        // No mismatch found
        // Returns: -1
    }
}

// ### Remember!
// - compare() on equal arrays -> 0
// - compare() on shorter array -> negative
// - compare() on longer array -> positive
// - mismatch() on equals arrays -> -1 | negative
// - mismatch() on different arrays -> index (0 or positive)
