// What is the output of the follwing code?
import java.time.*;
public class practice1 {
    public static void main(String[] args) {
        var date = LocalDate.of(2025, Month.APRIL, 30); // date 25-04-30
        date.plusDays(2); // 25-04-2
        date.plusYears(3); // 28-04-2
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth()); // 25-04-02
    }
}

// A. 2025 APRIL 30
// B. 2025 MAY 2
// C. 2028 APRIL 2 - good
// D. 2028 APRIL 30
// E. 2028 MAY 2
// F. The code does not compile.
// G. A runtime exception is thrown.
