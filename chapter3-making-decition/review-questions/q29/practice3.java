public class practice3 {
    static void forLoop() {
        int i = 0;
        for(;i<4;) { // 3
            System.out.println(i++); // 0,1,2,3
        }
    }
    static void whileLoop() {
        int x = 0;
        while(x < 5) { // 4
            System.out.println(++x + " "); // 1,2,3,4,5
        }
    }
    static void doWhileLoop() {
        int x = 0;
        do {
            System.out.println(++x + " "); // 1,2,3,4,5,6,7
        } while (x < 7); // 6
    }
    public static void main(String[] args) {
        //doWhileLoop();
        forLoop();
    }
}