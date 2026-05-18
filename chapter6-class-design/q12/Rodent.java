// How many lines of the following program contain a compilation error?

public class Rodent {
    public Rodent(Integer x) {}
    protected static Integer chew() throws Exception {
        System.out.println("Rodent is chewing");
        return 1;
    }
}
class Beaver extends Rodent {
    public Number chew() throws RuntimeException {
        System.out.println("Beaver is chewing on wood");
        return 2;
    } }

// A. None
// B. 1
// C. 2
// D. 3
// E. 4
// F. 5


