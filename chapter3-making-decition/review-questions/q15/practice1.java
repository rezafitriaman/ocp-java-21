import java.util.*;

//Enhanced 'for loop' works if the thing on the right of ':' is:
// - an array (primitive or reference), OR
// - an Iterable / an object that impements `Iterable`
public class practice1 {
    public static void main(String[] args) {
        for (var penguin : new int[2]) // this is aan array
            System.out.println(penguin); // int - 0, 0 - primary type int, so it is default to 0

        var ostrich = new Character[3];
        for (var emu : ostrich) // this is an array
             System.out.println(emu); // Character - it print null, null, null - because Wrapper class default to null

        List<Integer> parrots = new ArrayList<Integer>(); // `List` implements `Iterable<Integer>`
        for (var macaw : parrots)
            System.out.println(macaw); // Integer - [] - it print nothing - is a List - is an ArrayList<>
    }
}