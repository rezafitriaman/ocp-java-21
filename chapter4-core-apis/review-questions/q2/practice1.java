// Which of these array declarations are not legal? (Choose all that apply.)
public class practice1 {
    public static void main(String[] args) {
        int[][] scores = new int[5][]; // legal
        Object[][][] cubbies = new Object[3][0][5]; // legal
        String beans[] = new beans[6]; // need to be new String[6] - error connot find symbol
        java.util.Date[] dates[] = new java.util.Date[2][]; // legal
        int[][] types = new int[]; // not legal - need to be new int[5][] or new int[5][1]
        int[][] java = new int[][]; // not legal - need to be new int[5][] or new int[5][1] - the first [] need to be have a value
    }
}
