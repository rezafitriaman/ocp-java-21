// Which of the following are true about the following code? (Choose all that apply.)
public class Run { // pub class
    static void execute() { // static methode
        System.out.print("1-");
    }
    static void execute(int num) { // static methode
        System.out.print("2-");
    }
    static void execute(Integer num) { // static methode
        System.out.print("3-");
    }
    static void execute(Object num) { // static methode
        System.out.print("4-");
    }
    static void execute(int... nums) { // static methode
        System.out.print("5-");
    }
    public final static void main(String[] args) { // static main
        Run.execute(100); // exectute with 100 int | 2-
        //Run.execute(100); // execute with 100 int -> Integer | autoboxed to Integer | 3-
        Run.execute(100L); // execute with 100L long | long -> Long -> Object | autoboxed to Long | Long is an Object | 4-

    }
}

// A. The code prints out 2-4-. // This one
// B. The code prints out 3-4-.
// C. The code prints out 4-2-.
// D. The code prints out 4-4-.
// E. The code prints 3-4- if your remove the method static void execute(int num). // this one
// F. The code prints 4-4- if your remove the method static void execute(int num).