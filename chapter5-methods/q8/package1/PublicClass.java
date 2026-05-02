package package1;
// B. A `public` class that has private fields and package methods is not visible to classes outside the package.

public class PublicClass {
    private int privateField = 10; // private access - So this is only accessable only inside this class
    void packagePrivateMethod() { // default access - So this is only access able only on the same package
        System.out.println("package-private method/default-access in PublicClass");
    }
    public void publicMethod() { // public access - so this method is everywhere accessable.
        System.out.println("public method in PublicClass");
    }
}

// A `Public` calss is accessible from any other class, regardless of the package. However, its private fields are accessible only within the class itself,
// and package-private (default) methods are accessible only within the same package.