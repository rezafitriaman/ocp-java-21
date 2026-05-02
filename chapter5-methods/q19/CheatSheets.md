# Instance Variable:
An instance variable is a non-static field declared within a class but outside any methode, constructor, or block.
Each instance (object) of the class has its own copy of these variables.

**Initialization:**
Instance variables can be initialized at the time of declaration, within instance initializers, or within constructors.
If not explicitly initialized, they receive `default values` (e.g., `0` for integers, `null` for object references).

**Scope and Lifetime:**
They are accessible to all non-static methods of the class and exist as long as the object exists.

**Example:**
```java
public class Example {
    int instanceVar1; // Instance variable | receive default values `0` for integers, `null` for object references
    int instanceVar2 = 0; // Initialized at the time of declaration
    int instanceVar3; // Initialized within instance initializer block
    int instanceVar4; // Initialized within constructor
    { // instance initializers
        instanceVar3 = 10;
    } 
    public Example { // constructor
        instanceVar4 = 20;
    }
}
```

# Final Instance Variable:
A final instance variable is an instance variable declared with the `final` keyword, meaning its value cannot be changed once assigned.

**Initialization:**
It must be initialized either at the time of declaration, within an instance initializers, or within the constructor.
Failure to initialize a final instance variable results in a `compilation error`.

**Scope And Lifetime:**
Similar to regular instance variables, they are tied to the instance and exist as long as the object exists.

**Example:**
```java
public class Example {
    final int finalInstanceVar1; // Final instance variable | need to be initialized | no default values | `compilation error`
    final int finalInstanceVar2 = 0; // Initialized at the time of declaration
    final int finalInstanceVar3; // Initialized within an instance initializers | need to be initialized  | no default values
    final int finalInstanceVar4; // Initialized within constructor | need to be initialized | no default value
    { // Instance Initializer
        finalInstanceVar3 = 10;
    }
    public Example (int value) { // constructor
        finalInstanceVar = value;
    }
}
```

# Static Variable (Class Variable):
A static variable is a class-level variable declared with the `static` keyword. It is shared among all instance of the class,
meaning only `one copy` exists regardless of the number of object created.

**Initialization:**
Static variables can be initialized at the time of declaration or within a static initializer block. If not explicitly initialized,
they receive `default values`.

**Scope and Lifetime:**
They are accessible to all instance and static methods of the class and exist for the duration of the program.

**Example:**
```java
public class Example {
    static int staticVar1; // Static variable | receive default values
    static int getStaticVar2 = 0; // Initialized at the time of declaration
    static int getStaticVar3; // Initialized within a static initializer block
    static { // static initializer
        getStaticVar3 = 10;
    }
}    
```

# Final Static Variable (Constant):
A final static variable is a static variable declared with the `final` keyword, making it a constant whose value cannot be changed once assigned.

**Initialization:**
It must be initialized at the time of declaration or within a static initializer block. The `JVM does not provide a default value` for
final static variables; they must be explicitly initialized.

**Scope and Lifetime:**
Being static, they are associated with the class rather than any instance and exist for the duration of the program.

**Example:**
```java
public class Example {
    static final int FINAL_STATIC_VAR1 = 100; // Final static variable | Its constant | Initialized at the time of declaration 
    static final int FINAL_STATIC_VAR2; // Initialized within static initializer block | no default value 
    static { // static initializer
        FINAL_STATIC_VAR2 = 200;
    }
}
```