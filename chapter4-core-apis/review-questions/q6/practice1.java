// How may of these line contains a compiler error?
import java.util.*;
public class practice1 {
    public final static void main(String... args) {
        double one = Math.pow(1,2);
        long two = Math.round(1.0); // double -> long, float -> int
        double three = Math.random(); // need to be double
        var doubles = new double[] {one, two, three};
        System.out.println(Arrays.toString(doubles));
        System.out.println("----");
        System.out.println(one);
        System.out.println(Math.min((byte)5,(byte)6));
        System.out.println(Math.ceil((float)6.9));
        System.out.println(Math.floor((float)6.9));
    }
}
