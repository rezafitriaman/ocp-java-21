public class practice2 {
    public static void main(String args[]) {
        //new forLoop().main(new String[0]);
        new whileLoop().main(new String[0]);
    }
}

class doWhile {
    public static void main(String[] args) {
        int y = -10;
        do {
            System.out.println(++y + " ");// -9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10,11
        } while (y <= 10);// -9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10

    }
}

class forLoop {
    public static void main(String[] args) {
        int x = 0;
        for(; x < 10; ++x) { // 1,2,3,4,5,6,7,8,9 | true
            System.out.println(x + " "); // 10
        }
        //System.out.println(x + " ");
    }
}

class whileLoop {
    public static void main(String[] args) {
        int x = 0;
        while(x < 10) {
            System.out.println(++x + " "); // 1,2,3,4,5,6,7,8,9,10
        }
    }
}