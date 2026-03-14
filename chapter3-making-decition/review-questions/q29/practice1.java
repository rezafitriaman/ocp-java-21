public class practice1 {
    public static void main(String[] args) {
        new PrintIntegers().main(null);
    }
}

class PrintIntegers {
    public static void main(String[] args) {

        System.out.println("PrintIntegers");
        int y = -2; // oke -2
        do {
            System.out.println(++y + " "); // -1 ,0 ,1 ,2 ,3, 4, 5, 6
        } while (y <= 5); // -1,0,1,2,3,4,5
    }
}