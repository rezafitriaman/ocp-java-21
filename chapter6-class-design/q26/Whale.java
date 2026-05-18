public abstract class Whale {
    public abstract void dive();
    public static void main(String[] args) {
        Whale whale = new Orca();
        whale.dive(3);
    }
}
class Orca extends Whale {
    static public int MAX = 3;
    public void dive() {
        System.out.println("Orca diving");
    }
    public void dive(int... depth) {
        System.out.println("Orca diving deeper "+MAX);
    } }

// A. Orca diving
// B. Orca diving deeper 3
// C. The code will not compile because of line 4.
// D. The code will not compile because of line 8.
// E. The code will not compile because of line 12.
// G. The code will not compile because of line 17.
// H. None of the above.

