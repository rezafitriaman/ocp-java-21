// Which of the following can fill in the blank to print avaJ? (Choose all that apply.)
public class practice1 { // public class

    final public static void main(String args[]) { // main
        var puzzle = new StringBuilder("Java"); // StringBuilder
//        String p = puzzle.append("vaJ$").substring(0,4);
        puzzle.append("vaJ$").substring(0,4);
        //0 1 2 3 4 5 6 7 8
        // J a v a - substring() - meaning: selected string
//        System.out.println(p); // Java
        System.out.println(puzzle); // JavavaJ$

//        System.out.println(puzzle);
//        System.out.println(puzzle.length());
//        puzzle = puzzle.append("vaJ$");
//        System.out.println(puzzle);
//        System.out.println(puzzle.length());
//        puzzle = puzzle.delete(0,3);
//        System.out.println(puzzle);
//        System.out.println(puzzle.length());
//        puzzle = puzzle.deleteCharAt(puzzle.length()-1);
//        System.out.println(puzzle);
//        System.out.println(puzzle.length());

//        var puzzle = new StringBuilder("Java");
//        puzzle.append("vaJ$").delete(0,3).deleteCharAt(puzzle.length());
//        System.out.println(puzzle);
    }
}

// Documentation:
// https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html

// Java.reverse(); // avaJ
// A. reverse() // good

// Java.append("vaJ$") // JavavaJ$
// JavavaJ$.substring(0,4);
//0 1 2 3 4 5 6 7 8
// J a v a v a J $ - because it return String so you need to save it in to a variable
// B. append("vaJ$").substring(0,4) - StringBuilder.substring() return String - wrong

// JavavaJ$.delete(0,3)
//0 1 2 3 4 5 6 7 8
// a v a J $
// avaj$.deleteCharAt(puzzle.length() - 1)
// avaj$.length() = 5 - 1
// avaj$.deleteCharAt(4) - avaj
// avaj
// C. append("vaJ$).delete(0,3).deleteCharAt(puzzle.length() - 1) - avaj - good

//0 1 2 3 4 5 6 7 8
//a v a J $.delete(0,3)
//avaj$.length() = 5
// avaj$.deleteCharAt(5) - StringIndexOUtOfBoundsException
// D. append("vaJ$).delete(0,3).deleteCharAt(puzzle.length()) - wrong
// E. None of the above
