// Data Types

// byte and Byte -128 to 127
// short and Short -32,768 to 32,767
// char and Character 0 to 65,535
// enum
// String
public class practice2 {
    public static long dance(Object n)  {
        return switch (n) {
            case "1" -> 2;
            case "2" -> 3;
            case "3" -> 4;
//            case null -> 0;
            default -> 1;
        };
    }
    public static void main(String args[]) {
        System.out.println(dance("2"));
    }
}