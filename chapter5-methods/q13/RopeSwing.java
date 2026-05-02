import rope.*; // import pacakge all rope
//import static rope.Rope.*; // import all static from class Rope
public class RopeSwing { // public class
    private static int i = 0;
    static {
        System.out.println("RopeSwing static initializer: " + i);
    }
    private static Rope rope1 = new Rope(); // private static Rope
    //private static Rope rope2 = new Rope(); // private static Rope
    { // initializer | this never runs because we dont construct or create the RopeSwing
        System.out.println("RopeSwing initializer");
        //System.out.println(rope1.length); // length is public static | 8
    }
    public static void main(String[] args) { // static main
        //rope1.length = 2; // set length to 2
        //rope2.length = 8; // set length to 8
        new RopeSwing(); // then it print 8
        //System.out.println("RopeSwing static main: " +  Rope.length); // 8
        System.out.println("RopeSwing static main"); // 8
    }
}