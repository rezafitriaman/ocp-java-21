package rope; // package
public class Rope { // public class
    public static int LENGTH = 5; // public static var
    public static String s = "Rope";
    static { // static initializer | this runs before the constructor
      LENGTH = 10; // package static var
    }
    public int getLength() {
        return LENGTH;
    }
    public static void swing() { // public static methode
       System.out.println("swing ");
    } }