public class RopeSwing { // public class
    private static final String leftRope; // private static final | undefined | left
    private static final String rightRope; // private static final | undefined | right | right | error its allready set
    private static final String bench; // private static final | undefined | bench
    private static final String name = "name"; // privaste static final | undefined | name | name | error its allready set
    private String s;
    static { // static initializer
        leftRope = "left";
        rightRope = "right";
    }
    static { // static initializer
        //name = "name";
        //rightRope = "right";
        bench = "RopeSwing";
    }
    {
        s = "yes";
        //s = "yes";
    }
    static {
        System.out.print("static RopeSwing");
    }
    RopeSwing() {
        System.out.println("Constructing RopeSwi " + s);
        //bench = "RopeSwing";
    }
    final public static void main(String[] args) { // static main
        //RopeSwing swing = new RopeSwing();
        //bench = "bench";
    }
}

// How many lines in the following code have compiler errors?
// A. 0
// B. 1
// C. 2 // this one
// D. 3
// E. 4
// F. 5

