public class practice1 {
    public static void main(String[] args) {
        // Try to create 3 loops
        // while - do while - for
        int height = 1; // oke
        L1: while (height++ <10) { // while loop - 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//            System.out.println(height); // 2,3,4,5,6,7,8,9,10
            long humidity = 12; // oke
            L2: do {
                if (humidity-- % 12 == 0 ) {System.out.println("do while"); continue L2; } // 12,11,10,9,8,7,6,5,4 - continue L1 || break L2 || break L1
//                System.out.println(humidity);
                int temperature = 30; // oke
                L3: for ( ; ; ) { // an infinite loop
                    //temperature++; // 30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50
                    System.out.println("temperature: " + temperature++);
                    if (temperature>50) {System.out.println("for loop"); continue L3;}; // continue L2 || continue L1 || break L3 || break L2 | break L1
                }
            } while (humidity > 4); // do-while loop - 11,10,9,8,7,6,5,4
        }
    }

}