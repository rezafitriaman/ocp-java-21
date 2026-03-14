// Given the follwing method, how many lines contain compilation errors?
// 4 lines
public class practice1 { // good
    enum DayOfWeek { //good
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; // good
        private DayOfWeek getWeekDay(int day, final int thursday) { // good - return DayOfWeek -
            int otherDay = day; // good
            int sunday = 0; // good
            switch (otherDay) { // good - int
                default: // good
                case 1: continue; // bad - no continue allowed in switch statement
                case thursday: return DayOfWeek.THURSDAY; // bad - thursday can change because it is a parameter - it is a final int parameter - but it does not matter - return is allowd because this is inside an methode
                case 2,10: break; // good
                case sunday: return DayOfWeek.SUNDAY; // bad - is not final
                case DayOfWeek.MONDAY: return DayOfWeek.MONDAY; // bad - case is not an int but an enum, it need to be an int because the switch param is an int
            }
            return DayOfWeek.FRIDAY; // good
        }}
}