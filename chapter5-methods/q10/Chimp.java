import rope.*; // import
import static rope.Rope.*; // import static
public class Chimp { // public class
    final public static void main(String[] args) { // main methode
        Rope.swing(); // public static | print swing
        //Chimp c = new Chimp();
        Rope r = new Rope();
        System.out.println("Length: " + r.getLength());
        r.swing(); // new Object | print swing | u can call a static methode through an instance variable
        System.out.println(LENGTH); // LENGTH IS PUBLIC static print 5 | u did import static rope.Rope.*; so u can do this
        System.out.println(s);
    } }