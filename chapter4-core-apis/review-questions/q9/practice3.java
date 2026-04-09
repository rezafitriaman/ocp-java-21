class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    // Real-world analogy:
    // Default (`equals() from Object`)
    // Are these the exact same person?
    // Overridden (`equals()` in Person)
    // Do these people have the same name?
    @Override
    public boolean equals(Object obj) {
       if (this == obj) return true;

       if (!(obj instanceof Person)) return false;

       Person other = (Person) obj;
       return this.name.equals(other.name);
    }

    // If u override `equals()`, you should also ovrride hashCode()
    // Otherwise collections like `HashMap` break.
    public static void main(String[] args) {
        Person person = new Person("John");
        Person person2 = new Person("John");

        Person person3 = new Person("John");
        Person person4 = person3;

        System.out.println("Does these people have the same name?: " + person.equals(person2)); // it has the same name
        System.out.println("Does these people have the same name?: " + person.equals(person4)); // it has the same nam

        System.out.println("Are this the exact person?: " + (person == person2)); // is not the same Object
        System.out.println("Are this the exact person?: " + (person3 == person4)); // is the same object
    }
}
