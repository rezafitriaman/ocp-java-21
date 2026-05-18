// Which statements about the following classes are correct? (Choose all that apply.)
public class Mammal {
    private void eat() {}
    protected static void drink() {}
    public Integer dance(String p) {return null; }
}
class Primate extends Mammal {
    public void eat(String p) {}
}
class Monkey extends Primate {
    public static void drink() throws RuntimeException {}
    public Number dance(CharSequence p) { return null; }
    public int eat(String p) {}
}

// A. The eat() method in Mammal is correctly overriden on 7.
// B. The eat() method in Mammal is correctly overloaded on line 7.
// C. The drink() method in Mammal is correctly overridden on line 10.
// D. The drink() method in Mammal is correctly hidden on line 10.
// E. The dance() method in Mammal is correctly overridden on line 11.
// F. The dance() method in Mammal is correctly overloaded on line 11.
// G. The eat() method in Primate is correctly hidden on line 12.
// H. The eat() method in Primate is correctly overloaded on line 12.