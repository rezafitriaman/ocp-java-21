// Example how the Date, Time, Zone works
// U are John, living in New York, booking a flight that departs from Amsterdam to Tokyo.
import java.time.*;
import static java.time.Duration.*;

public class practice2  {
    public static void main(String[] args) {
        FlightBooking.booking();
    }
}

public class FlightBooking {
    public static void booking() {
        // Sarah lives in New York, but found a cheap flight from Amsterdam to Bali

        System.out.print("=== FLIGHT BOOKING FOR SARAH (lives in NYC) ===\n");

        // Flight infromation from airline
        LocalDateTime flightTimeAmsterdam = LocalDateTime.of(2026, 6, 15, 14, 30);
        ZoneId amsterdamZone = ZoneId.of("Europe/Amsterdam");
        ZonedDateTime flightDeparture = ZonedDateTime.of(flightTimeAmsterdam, amsterdamZone);

        System.out.println("Fligth departs Amsterdam airport: " + flightDeparture);
        System.out.println("(This is the time in Amsterdam)\n");

        // Convert to Sarah's local time (New York);
        ZoneId sarahHomeZone = ZoneId.of("America/New_York");
        ZonedDateTime flightInNYTime = flightDeparture.withZoneSameInstant(sarahHomeZone);

        System.out.println("For Sarah in New York, this means: " + flightInNYTime);
        System.out.println("Sarah need to be at Amsterdam airport by " + flightDeparture.toLocalTime() + " " + flightDeparture.getZone() + " time");

        System.out.println("Which is " + flightInNYTime.toLocalTime() + " " + flightInNYTime.getZone() + " time\n");

        // Calculate when Sarah needs to leave New York
        LocalDateTime flightFromNY = LocalDateTime.of(2026, 6, 14, 21, 0); // The day before departure in Amsterdam

        ZonedDateTime nyDeparture = ZonedDateTime.of(flightFromNY, sarahHomeZone);
        ZonedDateTime amsterdamArrival = nyDeparture.plusHours(7).plusMinutes(30).withZoneSameInstant(amsterdamZone);
        Duration connectionTime = Duration.between(amsterdamArrival, flightDeparture);

        System.out.println("Sarah's flight from NY to Amsterdam:");
        System.out.println("Departs NY: " + nyDeparture);
        System.out.println("Arrives Amsterdam: " + amsterdamArrival);
        System.out.println("Time until connection: " + connectionTime.toHours() + " hours " + connectionTime.toMinutesPart() + " minutes");

        if (connectionTime.toHours() < 3) {
            System.out.println("\n Warning: Connection time too short! (Need at least 3 hours)");
        } else {
            System.out.print("\n Connection time is reasonable.");
        }
    }
}