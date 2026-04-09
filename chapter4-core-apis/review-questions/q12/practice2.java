public class practice2 {
    final static public void main(String[] args) {
        // ## What is the length?
        String numbers = "012345678".indent(1); // Original String = "012345678" -> length = 9
        System.out.println(numbers.length()); // Adds 1 leading space - adds 1 newline (\n) at the end = " 012345678\n" = length() is then 11
        // .indent(int n)
        // Adds:
        // spaces (or removes if negative)
        // always adds `\n` at the end
        // "abc".indent(1) -> " abc\n"
        System.out.println("----");
        numbers = numbers.stripLeading();
        System.out.println(numbers.length());
        System.out.println("numbers: " + numbers + "test");
        // .translateEscapes()
        System.out.println("----");
        String s = "\\n";
        System.out.println(s);
        System.out.println("X: " + s.translateEscapes() + ":X");
        // Text Blocks (""")
        // Automatically includes:
        // `\n` between lines
        // usually a trailing newline
        System.out.println("----");
        String text = """
            abc
           def
            i
        """;
        System.out.println(text + "X");
        System.out.println("Text length: " + text.length());
        System.out.println("----StripIndent Example start");
        System.out.println(text.stripLeading());
        System.out.println("----StripIndent Example end");
        System.out.println("----");
        System.out.println("X" + text + "X");
        System.out.println("----");
        // Manually incosistent indentation
        String dynamic = "   line 1\n   line 2\n   line 3 line 4";
        System.out.println(dynamic);
        System.out.println(dynamic.stripIndent());
        System.out.println("----");
        // .formatted()
        // Does NOT add hidden characters by itself, but depends on format:
        // "%s\n".formatted("hi") -> "hi\n"
        String hi = "hi";
        System.out.println("%s Master Reza".formatted(hi));
    }
}