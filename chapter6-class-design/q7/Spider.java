class Arthropod {
    protected void printName(long input) {
        System.out.print("Arthropod");
    }
    void printName(int input) {
        System.out.print("Spooky");
    } }
public class Spider extends Arthropod {
    protected void printName(int input) {
        System.out.print("Spider");
    }
    public static void main(String[] args) {
        Arthropod a = new Spider();
        a.printName((short)4);
        a.printName(4);
        a.printName(5L);
    } }

// What is the output of the following code?
// A. SpiderSpiderArthropod
// B. SpiderSpiderSpider
// C. SpiderSpookyArthropod
// D. SpookySpiderArthropod
// E. The code will not compile because of line 5.
// F. The code will not compile because of line 9.
// G. None of the above.
