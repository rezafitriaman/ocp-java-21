public class practice1 {
    enum DayOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        private DayOfWeek getWeekDay(int day, final int thursday) {
            int otherDay = day;
            final int sunday = 0;
            final int otherThursday = 9;
            switch (otherDay) {
                default: ; // u need a break, otherwise the return on DayOfWeek.FRIDAY is unreachable. so it does not compile.
                case 1: ;
                case otherThursday: System.out.println(DayOfWeek.THURSDAY);
                case 2,10: break; // so this break need to place it gefore the first return and remember the case statement is fall throught!
                case sunday: return DayOfWeek.SUNDAY;
                case 3: return DayOfWeek.MONDAY;
            }
            return DayOfWeek.FRIDAY;
        }}
    public static void main(String... args) {
        System.out.println(DayOfWeek.SUNDAY.getWeekDay(11,3));
    }
}
