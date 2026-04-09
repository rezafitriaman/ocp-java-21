// Which of the following return 5 when run idependently? (Choose all that apply.)
import java.util.*;
public class practice {
    public static final void main(String... args) {
        var string = "12345"; // index: 0 1 2 3 4
        var builder = new StringBuilder("12345");
        System.out.println(builder.charAt(4)); // 5
        System.out.println(builder.replace(2, 4, "6").charAt(3)); // 1265 .charAt(3) 5
        System.out.println(string.replace("123", "1").charAt(2)); // 145 .charAt(2) 5
    }
}

// A. builder.charAt(4) // 12345 - this
// B. builder.replace(2, 4, "6").charAt(3) // 1265 - this
// C. builder.replace(2, 5, "6").charAt(2) // 126
// D. string.charAt(5)
// E. string.length // This is for arrays
// F. string.replace("123", "1").charAt(2) // 145 - this
// G. None of the above