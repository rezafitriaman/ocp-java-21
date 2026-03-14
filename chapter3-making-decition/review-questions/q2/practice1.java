// Which of the following data types can be used in a switch expression?
// ---
// enum X
// int  X
// Byte X
// long
// boolean
// double
// ---
// --- the available type are: char, byte, short, int, enum, String and the wrapper type: Character, Byte, Short, Integer
public class practice1 {
    public final static void main(String... args) {
        //--- enum
        enum choise {
            TRUE,
            FALSE
        }

        String b = switch (choise.FALSE) {
            case choise.TRUE -> "yes";
            case choise.FALSE -> "no";
        };

        System.out.println(b);

        //--- int
        int brand = 5;
        String pc = switch (brand) {
            case 5 -> "pc";
            case 6 -> "apple";
            default -> "unknown";
        };

        System.out.println(pc);

        //---
    }
}