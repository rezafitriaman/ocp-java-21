// What is the result of calling getHatSize(9f) on the following code snippet?

public class practice1 {
    static int getHatSize(Number measurement) { // 9f - float - (f)float -> Float -> Number
        return switch (measurement) { // this is switch expression
            case Double d -> 1 + d.intValue(); // Double -> Number
            case null -> 11; // null -> Number
            case Float f when f < 10 -> 4 + f.intValue(); // unreachable code - because Number catch everyting - Float -> Number
            case Long l -> 10 + l.intValue();
            case Number n -> 3 + n.intValue(); // x - (!) cant use this on switch expression - Number -> Number
        }; // oke
    }
    public final static void main(String[] args) {
        System.out.println(getHatSize((byte)3));
    }
}