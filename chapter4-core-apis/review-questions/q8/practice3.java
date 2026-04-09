class practice3 {
    private static String Question1() {
        // Question 1
        String s = "abcdef";
        String result = s.substring(1, 4).replace("b", "X");
        //  a b c d e f
        // 0 1 2 3 4 5 6
        return result; // bcd.replace("b", "X") = Xcd
    }

    private static String Question2() {
        // Question 2
        String s = "abcdef";
        String result = s.substring(2, 5).replace("e", "Z").charAt(1) + "";
        // 0 1 2 3 4 5 6
        //  a b c d e f
        return result; // cde.replace("e", "Z") = cdZ.charAt(1) + "" = d + "" = d
    }

    private static String Question3() {
        // Question 3
        StringBuilder sb = new StringBuilder("abcdef");
        // 0 1 2 3 4 5 6
        //  a b c d e f
        sb.replace(1, 4, "X"); // aXef
        //0 1 2 3 4
        // a X e f
        String result = sb.substring(1, 3); // Xe
        return result; // Xe
    }

    private static char Question4() {
        // Question 4
        String s = "abcdef";
        //0 1 2 3 4 5 6
        // a b c d e f
        // cde.length() = 3
        return s.charAt(s.substring(2, 5).length()); // d
    }

    private static char Question5() {
        // Question 5
        StringBuilder sb2 = new StringBuilder("abcdef");
        //0 1 2 3 4 5 6
        // a b c d e f
        sb2.replace(2, 5, "YZ"); // abYZf
        return sb2.charAt(3); // abYZf.charAt(3) = Z
    }

    private static String Question6() {
        // Question 6
        String s = "abcdef";
        //0 1 2 3 4 5 6
        // a b c d e f
        StringBuilder sb = new StringBuilder(s.substring(1, 5)); // bcde
        //0 1 2 3 4
        // b c d e
        sb.replace(1, 3, "X"); // bcde.replace(1, 3, "X") = bXe
        return sb.toString(); // bXe
    }

    public final static void main(String[] args) {
        System.out.println("Question1: " + Question1());
        System.out.println("Question2: " + Question2());
        System.out.println("Question3: " + Question3());
        System.out.println("Question4: " + Question4());
        System.out.println("Question5: " + Question5());
        System.out.println("Question6: " + Question6());
    }
}
