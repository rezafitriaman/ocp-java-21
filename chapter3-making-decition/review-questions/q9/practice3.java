public class practice3 {
    public final static void main(String[] args) {
        BUNNY: for(int row=1; row<4; row++) {
            RABBIT: for(int coll=1; coll<=3; coll++) {
                if(row%2==0) {
                    System.out.println(row + " " + coll);
                }
                // 0+1|false
                // 0+2|true
                // 0+3|false
                // 1+1|true
                // 1+2|false
                // 1+3|true
                // 2+1|false
                // 2+2|true
                // 2+3|false
                //System.out.println((row+coll)%2==0);
            }
        }
    }
}