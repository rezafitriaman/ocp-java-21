package package2;

import package1.PublicClass;

public class ExternalClass {
    public void accessMethods() {
        PublicClass obj = new PublicClass();
        obj.publicMethod(); // Accessible

        // obj.packagePrivateMethod(); // Not accessible, causes compilation error
        // int value = obj.privateField; // Not accessible, causes compilation error
    }
    public static void main(String[] args) {
        new ExternalClass().accessMethods();
        // new PublicClass().packagePrivateMethod(); // is not public in PublicClass
    }
}

