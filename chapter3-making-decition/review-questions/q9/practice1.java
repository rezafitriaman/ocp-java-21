// Which statements, when inserted independently into the following blank, will cause the code to print 2 at runtime?
// ---
// break BUNNY      - it stop all the loop
// break RABBIT     x
// continue BUNNY   x
// continue RABBIT  - more then 2
// break            x
// continue         - more then 2
// None of the above, as the code contains a compiler error
public class practice1 {
    public final static void main(String[] args) {
        int count = 0; // 0,1,2
        BUNNY: for (int row = 1; row <=3; row++) // it run 3 times - 1 <= 3 - 1 2 3 | row
            RABBIT: for (int col = 0; col <3 ; col++) { // it run 3 times - 0 < 3 - 0 1 2 | col
                if ((col + row) % 2 == 0)
                    continue; // -, continue BUNNY,  continue BUNNY, -
                count++; // 0,-,-,1
            }
        System.out.println(count); // 2
    }
    // break RABBIT
    // 0 + 1 | 1 % 2 == 0 | false - 0 + 2 | 2 % 2 == 0 | true, 0 + 2 | 2 % 2 == 0 | true - 3 + 0 | 3 % 2 == 0 | false
    // continue RABBIT
    // 0+1=1 | 1%2==0 | false, 1+1=2 | 2%2==0 | true, 2+1=3 | 3%2==0 | false, 0+2=2 | 2%2==0 | true, 1+2=3 | 3%2==0 | false, 2+2=4 | 4%2==0 | true,
    // continue BUNNY
    // 0+1 | 1%2==0 | false, 1+1 | 2%2==0, | true, 0+2 | 2%2==0 | true, 0+3 | 3%2==0 | false,
}