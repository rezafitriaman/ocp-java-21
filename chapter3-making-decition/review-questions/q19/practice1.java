public class practice1 {
    public static void main(String[] args) {
        double iguana = 0;
        do {
            int snake = 1; // is in the do body!
            System.out.print(++snake + " ");  // 1
            iguana--; // 0
        } while (snake <=5); // is out of scope!! - remember this is also in javascript!!
        System.out.println(iguana);
    }

}