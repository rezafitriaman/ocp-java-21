package my.city; // package
// this class is in different package, that means that private, pacakge, protected access does not work!
// private access: only accessible in the same class.
// package access | private-package access: is only accessible in the same pacakge.
// protected access: is only accessible in the same pacakge or in the subclass.
import my.school.*; // import
public class School { // public class
    public static final void main(String[] args) { // main methode
        System.out.println(Classroom.globalKey); // globalKey is package static variable | compiler error | this is in another package
        Classroom room = new Classroom(101, "Mrs. Anderson"); // package constructor | compiler error | this is in another package |object is created with int and String | set private roomNumber and protected static teacherName
        System.out.println(room.roomNumber); // roomNumber is private variable | compiler Error
        System.out.println(Classroom.floor); // public static variable
        System.out.println(Classroom.teacherName); } // protected static variable | compiler Error | Classroom is not in the same package or need to be printed from School and School need to be sublcass from Classroom

}