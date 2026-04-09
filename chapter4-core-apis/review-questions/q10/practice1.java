// How many of these lines contain a compiler error?
public class practice1 {
    public static void main(String... args) {
        // ### Take the smalles of the 2
        // int Math.min(int a, int b);
        // long Math.min(long a, long b);
        // float Math.min(float a, float b);
        // double Math.min(double a, double b);
        // ### Take the bigges of the 2
        // The same for int | long | float | double Math.max(int | long | float | double a, int | long | float | double b);
        int one = Math.min(5, 3);
        System.out.println(one); // this will compile - 3

        // ### Math.round() has 2 overloaded signature:
        // Return the nearrest wole number
        // int Math.round(float a);
        // long Math.round(double a);
        long two = Math.round(5.5);
        System.out.println(two); // this wiil compail - 5L

        // ### Math.floor(); Meaning if a number have an decimal till (6.9) goes down to the floor wich is 6.0.
        // Take always double and return always double  - double Math.floor(double a);
        // ### Math.ceil(); Meaning if a number have an decimal minimaal (6.1) it goes up to the ceiling wich is 7.0.
        // Take always double and return always double - double Math.ceil(double a);
        double three = Math.floor(6.6);
        System.out.println(three); // this will compile - 6.0
        // ### This is an arrays that has a type double
        System.out.println("---");
        var doubles = new double[] {one, two, three};
        for (double i : doubles) {
            System.out.println(i);
        }
    }
}

// A. 0
// B. 1 - This one
// C. 2
// D. 3
// E. 4
