// Given the following method, which of the method calls return 2? (Choose all that apply.)
public class practice1 {
    public int juggle(boolean b, boolean... b2) {
        return b2.length;
    }

    final public static void main(String[] args) {
        boolean[] b = {true, true};
        System.out.println(new practice1().juggle(true, new boolean[]{true, true}));
    }
}

// A. juggle();
// B. juggle(true);
// C. juggle(true, true);
// D. juggle(true, true, true); - correct
// E. juggle(true, {true, true});
// F. juggle(true, new boolean[2]); - correct