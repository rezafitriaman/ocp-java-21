// C. You can use access modifiers so only some of the classes in a package see a particular package class. --false

// *Clarification:*
// In java, access modifiers do not provide a way to restrict access to a class to only certain other classes within the same package.
// Package-private access allows all classes within the same package to access the class, without the ability to specify particular classes.

package package1;

class PackagePrivateClass {
    void display() {
        System.out.println("display - Package-private/default-access modifier class method");
    }
}