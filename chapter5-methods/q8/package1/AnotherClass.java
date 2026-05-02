package package1;

public class AnotherClass {
    public void accessMethod() {
        PackagePrivateClass obj = new PackagePrivateClass();
        obj.display(); // Accessible because it's in the same package
    }

    public static void main(String[] args) {
        new AnotherClass().accessMethod();
    }
}