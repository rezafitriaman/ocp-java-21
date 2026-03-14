// What is the minimum number of lines that would need to be changed or removed for the following
// code to compile and return value when called with dance(10)
public class practice1 {
    static double dance(Integer speed) { // need to be Number
        return switch (speed) {
            case 5 -> {yield 4;}
            case 10 -> 8;
            case 15,20 -> 12;
            default -> 16;
            //case null -> 16; // compiler error - this code is not reachable
        };
    }
    public static void main(String[] args) {
        System.out.println(dance(10));
    }
}