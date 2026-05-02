package package1;
// In Java, package-private (default) access allows members to be accessible only within the same package
// Protected access, however, permits access within the same package and ALSO to subclasses in diferent package.
// Therefore, protected access is more permissive than package-private access (default access).
public class BaseClass {
    void packagePrivateMethod() { // allow only on the same package
        System.out.println("--Package-private/package-access method in BaseClass");
    }

    protected void protectedMethod() { // allow only on the same package and sublcasses
        System.out.println("Protected method in BaseClass");
    }
    public static void main(String[] args) {}
}