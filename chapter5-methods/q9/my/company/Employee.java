package my.company; // pacakge

public class Employee { // public class
    private int id; // private var
    protected static String dept; // protected static var
    static String password = "abc123"; // package static var
    public static int officeNumber = 44; // public static var
    Employee(int id, String d) { // package constructor | with 2 parameters
        this.id = id;
        dept = d;
    }
}