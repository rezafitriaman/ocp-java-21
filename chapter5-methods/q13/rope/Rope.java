package rope; // package
public class Rope { // public class
    public static int length = 0; // public static var
    {
        System.out.println("Rope Initializer");
    }
    static {
        System.out.println("Rope static: " + length);
    }
}