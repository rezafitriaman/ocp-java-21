// What is the output of the follwing code snippet?
public class practice1 {
    public static final void main(String[] args) {
        boolean keepGoing = true;
        int result = 15, meters = 10;
        do {
            meters--;// 10, 9,
            if (meters==8) keepGoing = false;
            result -= 2; // 13, 11
        } while (keepGoing); // missing () so it does not compile
        System.out.println(result); // 11
    }
}