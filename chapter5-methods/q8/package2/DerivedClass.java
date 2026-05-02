package package2;

import package1.BaseClass;

public class DerivedClass extends BaseClass {
    public void accessMethods() {
        // protectedMethod() is accessible because DerivedClass is a sublcass
        super.protectedMethod();
        protectedMethod();

        // packagePrivateMethod() is not accessible because it's package-private (default access)
        // packagePrivateMethod(); // This would cause a compilation error
    }
    public static void main(String[] args) {
        new DerivedClass().accessMethods();
    }
}

// In this example, `protectedMethod()` is accessible in `DerivedClass` because it's protected and `DerivedClass` is
// sublcass of `BaseClass`, even though they are in different pacakages. However, `packagePrivateMethode()` is not accessible in
// `DerivedClass` because it's package-private and `DerivedClass` is in a different package.

