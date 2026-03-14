// What is the output of calling printReptile(6)?
public class practice1 {
    static void printReptile(int category) { // 6
        String type = switch (category) { // 6
            case 1, 2 -> "Snake";
            case 3, 4 -> "Lizard";
            case 5, 6 -> "Turtle"; // 6
            case 7, 8 -> "Alligator";
            //default -> "Unknown"
            // But an switch expression need an default case - so this has compilation error.
        };
        System.out.print(type);
    }
    public static final void main(String args[]) {
        //new practice1().printReptile(6);
        practice1.printReptile(9);
    }
}