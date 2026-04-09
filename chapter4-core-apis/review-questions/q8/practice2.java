// ### Methode from String or StringBuilder that use Exclusive End Index

public class practice2 {
    public static void main(String[] args) {
        // start index = inclusive
        // end index = exclusive

        //  String.substring(begin, end)
        //   a b c d e f
        //  0 1 2 3 4 5 6
        String s = "abcdef";
        System.out.println(s.substring(1, 4)); // bcd

        // StringBuilder.replace(start, end, str)
        //  a b c d e f
        // 0 1 2 3 4 5 6
        StringBuilder sb = new StringBuilder("abcdef");
        sb.replace(1, 4, "X");
        System.out.println(sb); // aXef

        // String.substring(start)
        // StringBuilder.substring(start, end)
        // StringBuilder.replace(start, end, str)
        // String.subSequence(start, end)
        // CharBuffer, List.subList(start, end)

        // ### Key Property
        // length = end - start
        // s.substring(1, 4)
        // 4 -1 = 3 characters
        // And indeed: bcd -> 3 characters

        // ### Use Boundaries for end-exclusief
        // 0   1   2   3   4   5
        // | a | b | c | d | e |
        // Start = where you begin cutting
        // End = where you stop cutting
        // End is NOT included because it's the boundary
    }
}