// Which of the following are output by this code? (Choose all that apply.)

public class practice1 {
    public static void main(String[] args) {
        var s = "Hello"; // String
        var t = new String(s); // new String()
        if ("Hello".equals(s)) System.out.println("one"); // true - from String pool
        if (t == s) System.out.println("two"); // == is a reference so t and s is not the same reference - false - not from String pool
        if (t.intern() == s) System.out.println("three"); // true
        if ("Hello" == s) System.out.println("four"); // true - from string pool
        if ("Hello".intern() == t) System.out.println("five"); // false

        System.out.println("---");
        System.out.println(t.intern()); //.intern() make new String() in to the String pool so it has the same reference
        System.out.println("Hello");
        System.out.println(s);
    }
}

// A. one - true
// B. two
// C. three - true
// D. four - true
// E. five
// F. The code does not compile.
// G. None of the above