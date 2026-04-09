// What is output by the following code ignoring any new lines in the ouput? (Choose all that apply.)
public class practice1 {
    public static void main(String[] args) {
        var numbers = "012345678".indent(1); // " 012345678\n"
        System.out.println("length: " + numbers.length()); // 11
        numbers = numbers.stripLeading(); // " 012345678\n"
        System.out.println("length: " + numbers.length()); // 10
        System.out.println(numbers.substring(1, 3)); // "12"
        System.out.println(numbers.substring(7, 7)); // "" - empty string
        System.out.println(numbers.substring(7)); // "78/n"
        System.out.println("X" + numbers + "X");
    }
}

// A. 12 // this one
// B. 123
// C. 7
// D. 78 // this on
// E. A blank line. // this one
// F. An exception is thrown
