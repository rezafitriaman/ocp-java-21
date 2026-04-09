// What is output by the following code?
public class practice1 {
    public final static void main(String[] args) {
        int numFish = 4; // int
        String fishType = "tuna"; // String
        String anotherFish = numFish + 1; // does not compile - int + int != String
        System.out.println(anotherFish + " " + fishType);
        System.out.println(numFish + " " + 1);
    }
}
