import java.time.*;
// Given the following, which can correcly fill in the blank allowing the code to compile? (Choose all that apply.)
public class practice1 {
    public static final void main(String... args) {
        var date = LocalDate.now(); // Date 2026-04-03
        var time = LocalTime.now(); // Time T12:51:40.262377
        var dateTime = date.atTime(time); // i want to append the time on the date: date.atTime(time) | 2026-04-03T12:38:40.262377
        var zoneId = ZoneId.systemDefault(); // CET, UTC+2 | Zone ID: Europe/Amsterdam
        var zonedDateTime = ZonedDateTime.of(dateTime, zoneId); // 2026-04-03T12:51+02:00[Europa/Amsterdam]
        // .toInstant() methode need zonedDateTime - hence zoned
        Instant instant = zonedDateTime.toInstant(); // 2026-04-03T10:38:40.262377Z

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(zoneId);
        System.out.println(zonedDateTime);
        System.out.println(instant);
    }
}

// A. asTime()
// B. atTime() // this
// C. withTime()
// D. dataTime.toInstant()
// E. new Instant()
// F. zonedDateTime.toInstant() // this