public class practice2 {
    final static public void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = sb.append("Java").substring(0,4);
        // Java
        // Java.append(sb)
        // JavaJava
        // JavaJava.delete(8-1, 8)
        //0 1 2 3 4 5 6 7 8
        // J a v a J a
        sb = sb.append(sb);
        System.out.println(sb);
        System.out.println(sb.length());
        sb = sb.delete(sb.length()-1,sb.length());
        System.out.println(sb);
        System.out.println(sb.length());
        sb = sb.deleteCharAt(sb.length()-1);

        System.out.println(sb);
        System.out.println(s);
    }
}

// C. append("vaJ$).delete(0,3).deleteCharAt(puzzle.length() - 1)
