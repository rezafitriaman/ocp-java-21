import java.time.*;
public class practice3 {
    public static void main(String[] args) {
        InternationalMeeting.meeting();
    }
}

class InternationalMeeting {
    public static void meeting() {
        // Meeting scheduled in Amsterdam at 14:30
        LocalDateTime meetingTimeAMS = LocalDateTime.of(2026, 4, 3, 14, 30); // static methode .of()
        ZoneId amsterdamZone = ZoneId.of("Europe/Amsterdam");
        ZonedDateTime meetingInAMS = ZonedDateTime.of(meetingTimeAMS, amsterdamZone);

        // Team members in different locations
        String[] teamMembers = {
               "Alice (Amsterdam)", "Bob (New York)", "Carol (Tokyo)", "David (London)"
        };
        ZoneId[] zones = {
          ZoneId.of("Europe/Amsterdam"),
          ZoneId.of("America/New_York"),
          ZoneId.of("Asia/Tokyo"),
          ZoneId.of("Europe/London")
        };

        System.out.println("Team meeting scheduled for: " + meetingInAMS + " - (Amsterdam time)\n");
        System.out.println("When each team member should join: ");

        for (int i = 0; i < teamMembers.length; i++) {
            ZonedDateTime localTime = meetingInAMS.withZoneSameInstant(zones[i]);
            System.out.println(teamMembers[i] + ": " + localTime.toLocalTime());
        }
    }
}