public class Rope { // public class
    public static void swing() {
        System.out.print("swing");
    } // public static method
    public void climb() {
        System.out.print("climb");
    } // public methode
    public static void play() { // public static methode
        swing(); // public static methode | static can call static
       // climb(); // public methode | static cannot call normal method | compilation error
    }
    public static void main(String[] args) { // static main method
        Rope rope = new Rope(); // new Rope() | new Object call
        rope.play(); // Object can call static methode
        Rope rope2 = null; // the reference is Rope but it set to null Object.
        System.out.print("-"); // print String "-"
        rope2.play(); // play is static | but it has Rope as reference | so it compile
    } }

// Which statements are true of the following code? (Choose all that apply.)
// A. The code compiles as is.
// B. There is exactly one compiler error in the code. // this one
// C. There are exactly two compiler errors in the code.
// D. If the line(s) with compiler errors are removed, the output is swing-climb.
// E. If the line(s) with compiler errors are removed, the output is swing-swing. // this one
// F. If the line(s) with compile errors are removed, the code throws a NullPointerException.
