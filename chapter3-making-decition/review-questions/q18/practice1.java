public class practice1 {
    static private void countAttendees() {
        int participants = 4, animals = 2, performers = -1;

        while ((participants = participants + 1) < 10) {} // 5, 6, 7, 8, 9, 10
        do {} while (animals++ <= 1); // 2
        for ( ; performers < 2; performers += 2) {} // 1, 3

        System.out.println(participants); // 10
        System.out.println(animals); // 3
        System.out.println(performers); // 3
    }
    public static final void main(String[] args) {
        countAttendees();
    }
}