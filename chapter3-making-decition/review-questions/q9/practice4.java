// continue
public class practice4 {
    public static final void main(String[] args) {
        int count = 0; // 13
        BUNNY: for (Integer row=0; row <5; row++) {
            RABBIT: for (Integer col=1; col<=5; col++) {
                if ((row+col)%2==0) {
                    continue;
                }
                System.out.println(row + " " + col);
                count++;
            }
        }
        System.out.println("----");
        System.out.println(count);
        // 01 count
        // 02 break, continue
        // 03
        // 04 continue
        // 05
        // 11 break, continue
        // 12
        // 13 continue
        // 14
        // 15 continue
        // 21 count
        // 22 break, continue
        // 23
        // 24 continue
        // 25
        // 31 break, continue
        // 32
        // 33 continue
        // 34
        // 35 continue
        // 41 count
        // 42 break, continue
        // 43
        // 44 continue
        // 45
    }
}