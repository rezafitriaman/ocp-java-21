import java.time.*;
// Note that March 12, 2028, is the wekend when we spring forward, and November 5, 2028
// is when we fall back for daylight saving time.
// Which of the following can fill in the blank without the code throwing an exception? (Choose all that apply.)
public class practice1 {
    public static final void main(String args[]) {
       var zone = ZoneId.of("US/Eastern"); // ZoneId
       var date = LocalDate.of(2028, 11, 6); // LocalDate.of(2028, 3, 12), LocalDate.of(2028, 11, 5), LocalDate.of(2028, 11, 6)
       var time = LocalTime.of(2, 15); // Time 2:15
       var z = ZonedDateTime.of(date, time, zone); //
        System.out.println(z);
    }
}
// LocalDate.of(2028, 3, 12) // compile
// LocalDate.of(2028, 3, 40) // not compile
// LocalDate.of(2028, 11, 5) // compile
// LocalDate.of(2028, 11, 6) // compile
// LocalDate.of(2029, 2, 29) // not compile
// LocalDate.of(2028, MonthEnum.MARCH, 12) // not compile