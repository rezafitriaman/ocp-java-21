// Which of the following will compile when independently inserted in the following code? (Choose all that apply.)
public class Order3 { // public class
    final String value1; // final instance var
    static String value2 = "blue"; // static instance var
    String value3 = "yellow"; // instance var
    { // instance initializer
        // CODE SNIPPET 1
        //value3 = "orange";
        value2 = "purple";
    }
    Order3() { // constructor
        value2 = "magenta";
        value1 = "red";
    }
    static { // instance static initializer
        // CODE SNIPPET 2
        value2 = "cyan";
    }
    public static void main(String[] args) {
        //Order3 o = new Order3();
        System.out.println(Order3.value2); // magenta
    }
}

// A. Insert at line 6: value1 = "green";
// B. Insert at line 6: value2 = "purple"; // this one
// C. Insert at line 6: value3 = "orange"; // this one
// D. Insert at line 9: value1 = "magenta";
// E. Insert at line 9: value2 = "cyan"; // this one
// F. Insert at line 9: value3 = "turquoise";

