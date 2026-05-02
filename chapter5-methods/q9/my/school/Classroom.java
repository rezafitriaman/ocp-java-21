package my.school; // pacakge
public class Classroom {// public class
    private int roomNumber; // private instance variable | default = 0
    protected static String teacherName; // protected static instance variable | default = null
    static int globalKey = 54321; // package static variable
    public static int floor = 3; // public static variable
    Classroom(int r, String t) { // package constructor with param int, String
        roomNumber = r; // int = int | private
        teacherName = t; } } // String = string | protected static