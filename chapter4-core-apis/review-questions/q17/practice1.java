// Wath is the result of the follwoing code? (Choose all that apply).
public class practice1 {
    public static void main(String[] args) {
        String s1 = """
                purr""";
        String s2 = ""; // String
        s1.toUpperCase(); // PURR
        System.out.println(s1);
        s1.trim(); // PURR
        System.out.println(s1);
        //0 1 2 3 4
        // P U R R
        s1.substring(1, 3); // UR
        System.out.println(s1);
        s1 += "two"; // URtwo

        s2 += 2; // 2 String + int = compilation error
        s2 += 'c'; // 2c char
        s2 += false; // 2cfalse boolean

        System.out.println(s2);
        if ( s2 == "2cfalse") System.out.println("=="); // ==
        if ( s2.equals("2cfalse")) System.out.println("equals"); // equals
        System.out.println(s1.length()); // 5
    }
}

// A. 2
// B. 4
// C. 7
// D. 10
// F. equals
// G. An exception is thrown.
// H. The code does not compile. This