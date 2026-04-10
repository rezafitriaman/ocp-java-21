// What is the output of the following?
import java.time.*;
public class practice1 {
    final public static void main(String[] args) {
        var result = LocalDate.of(2025, Month.OCTOBER, 31) // 25-oktober-31
                .plusYears(1) // 26-oktober-31 | 26-10-31
                .plusMonths(-5) // 10 - 5 = 5 | 26-05-31 | 26-mei-31
                .plusMonths(1) // 5 + 1 = 6 | 26-06-31 | 26-juni-31
                .withYear(2026) // 26-06-31 | 26-juni-31
                .atTime(LocalTime.of(13, 4)); // 26-juni-31T13:04
        System.out.println(result); // 2026-06-30T13:04
    }
}
// A. 2025-06-30T13:04
// B. 2026-04-304
// C. 2026-04-30T13:04
// D. 2026-06-30T
// E. 2026-06-30T13:04 - Correct
// F. The code does not compile.
// G. A runtime exception is thrown.