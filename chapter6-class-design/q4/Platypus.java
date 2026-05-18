// What is the output of the following program?
class Mammal {
    private void sneeze() {}
    public Mammal(int age) {
        System.out.print("Mammal");
    } }
public class Platypus extends Mammal {
    int sneeze() { return 1; }
    public Platypus() {
        System.out.print("Platypus");
    }
    public static void main(String[] args) {
        new Mammal(5);
    } }

// A. Platypus
// B. Mammal
// C. PlatypusMammal
// D. MammalPlatypus
// E. The code will compile if line 7 is changed.
// F. The code will compile if line 9 is changed.
