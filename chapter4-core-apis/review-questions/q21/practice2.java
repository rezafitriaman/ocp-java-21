import java.time.*;
public class practice2 {
    final static public void main(String[] args) {
        LocalDate ld = LocalDate.of(2025, Month.JANUARY, 30); // 25-01-30
        ld = ld.plusDays(3); // 25-02-2 but we ignore this - because LocalDate is imutable
        ld = ld.plusYears(5); // 30-02-2 but we ignore this - because LocalDate is imutable
        System.out.println(ld.getYear() + " " + ld.getMonth() + " " + ld.getDayOfMonth()); // 25-01-30
    }
}