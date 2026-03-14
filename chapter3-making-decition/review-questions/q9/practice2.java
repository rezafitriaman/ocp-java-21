// continue=go to next loop - skip all the line after this
// break= stop the loop
public class practice2 {
    public static final void main(String args[]) {
        int count = 0;
        BUNNY: for (int row=0; row<3; row++) {// 0-4 | 5times
            System.out.println("row");
            RABBIT: for (int coll=1; coll <= 4; coll++) {// 1-10 | 10times
                if ((coll+row)%2==0) { // 0+1|false,0+2,1+1,2+1|false,2+2,
                    break;
                }
                System.out.println("coll"); // we print this 2 time
            }
        }
    }
}
