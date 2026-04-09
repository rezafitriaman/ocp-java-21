// TODO write it again with explaination
public class practice2 {
    final public static void main(String[] args) {
        String s1 = """
                PARR""";
        String s2 = "";
        StringBuilder sb = new StringBuilder();
        sb.append("2");
        sb.append(2);
        sb.append('c');
        sb.append(false);
        s1.trim(); // PARR
        s1.toLowerCase(); // parr
        s1.substring(1,3); // AR
        s1 += "Three";
        System.out.println(s1); // PARRThree
        System.out.println(s1.length()); // 9
        s2 += "2";
        s2 += true;
        s2 += 'c';
        s2 += 8;
        System.out.println(s2); // 2truec8
        System.out.println(sb); // 22cfalse
        System.out.println("---");
        if (s1.equals("PARRThree")) System.out.println("s1: equals");
        if (s1 == "PARRThree") System.out.println("s1: ==");
        if (s1 == s1) System.out.println("s1 s1: ==");
        if (s1.intern() == "PARRThree") System.out.println("s1.intern(): ==");
        System.out.println("---");
        if (s2.equals("2truec8")) System.out.println("s2: equals");
        if (s2 == "2truec8") System.out.println("s2: ==");
        if (s2 == s2) System.out.println("s2 s2: ==");
        if (s2.intern() == "2truec8") System.out.println("s2.intern(): ==");
        System.out.println("---");
        if (sb.toString().equals("22cfalse")) System.out.println("sb: equals");
        if (sb.toString() == "22cfalse") System.out.println("sb.toString(): ==");
        if (sb == sb) System.out.println("sb sb: ==");
        if (sb.toString().intern() == "22cfalse") System.out.println("sb.toString().intern(): ==");
        //if (sb.toString() == sb) System.out.println("sb.toString() sb: =="); // incomparable types: String and StringBuilder
    }
    private static void memoryVisualization() {
        // ### Memory Visualization:
        String s2 = "";
        s2 += 2; // Creates new String "2" at heap address 0x1000
        s2 += 'c'; // Creates new String "2c" at heap address 0x2000
        s2 += false; // Creates new String "2cfalse" at heap address 0x3000

        // String literal "2cfalse" is in String Pool at address 0x4000
        s2 (0x3000) vs "2cfalse" (0x4000) -> different addresses -> == false
    }
    private static void usingInternMethode() {
        String s2 = "";
        s2 += 2; // Creates new String "2" at heap address 0x1000
        s2 += 'c'; // Creates new String "2c" at heap address 0x2000
        s2 += false; // Creates new String "2cfalse" at heap address 0x3000

        // Method 1: Use intern() to put in String Pool
        String s2interned = s2.intern();
        if (s2interned == "2cfalse") System.out.println("Now == works!");

        // Method 2: Use lieral from the start
        String s3 = "2cfalse"; // Already in String Pool
        if (s3 == "2cfalse") System.out.println("This works!");

        // Method 3: Compile-time constant
        String s4 = "2c" + "false"; // Compiler combines to "2cfalse" (in pool)
        if (s4 == "2cfalse") System.out.println("This alse works!");
    }

    private static void whenStringAreInTheStringPool() {
        String s1 = "hello"; // Literal
        String s2 = "he" + "llo"; // Compile-time constant
        String s3 = "hello".intern(); // Explicit intern()

        // NOT in String Pool (heap)
        String s4 = new String("hello"); // 'new' creates heap object
        String s5 = "he" + new String("llo"); // Runtime concatenation
        String s6 = ""; s6 += "hello"; // Runtime concatenation
    }

    private static void internDoesNotChangeTheOriginalObjectsAddress() {
        String s2 = "";
        s2 += 2; // s2 poins to "2" at address 0x1000
        s2 += 'c'; // s2 points to NEW "2c" at address 0x2000
        s2 += false; // s2 point to NEW "2cfalse" at address 0x3000

        // INTER() creates a NEW reference
        String internedString = s2.intern(); //Returns reference to pool (0x4000)

        // Original s2 still points to 0x3000
        // internedString points to 0x4000
        System.out.println(s2 == "2cfalse"); // false (0x3000 vs 0x4000)
        System.out.println(internedString == "2cfalse"); // true (0x4000 vs 0x4000)
        System.out.println(s2.equals("2cfalse")); // true (content comparison)

    }
}

// Key Takeaways
// About `.inter()`:
// - intern() returns a reference to the String Pool version
// - It does NOT modify the original reference
// - To use it, you must assign the return value: `s2 = s2.inter()`
// - The original heap object still exists but may be garbage collected

// About `+=` with Strings:
// - Auto-converts any type to STring (int, boolean, char, double, etc.)
// - Uses `StringBuilder` behind the scenes
// - Creates new String objects each time
// - Inefficent in loops - use `StringBuilder` directly instead

