public class practice5 {
    public static void main(String args[]) {
        int count = 0; //
        BUNNY:for (int col = 0; col < 3; col++) {
            RABBIT: for (int row = 1; row <= 3; row++) {
                System.out.println(row + " " + col);
                if((row+col)%2==0) {
                   // 10 count
                   // 20 break
                   // 30
                   // 11 break
                   // 21
                   // 31
                   // 12 count
                   // 22 break
                   // 32
                    break;
                }
                count++;
            }
        }

        System.out.print(count); // 2
    }
}