public class practice1 { // oke
    static void getFish(Object fish) { // methode that return void, it accept Object
        if (!(fish instanceof String guppy)) // if fish is instance of String then !true - false | if fish is not instance of String then !false true
            System.out.print("Eat!"); // It skip this
        else if (!(fish instanceof String guppa)) { // if fish is instance of String then !true - false | if previous is true then this will never run
            throw new RuntimeException(); // It skip this
        }
        System.out.print("Swim!"); // print Swim! | if the first if is true then this will never run
    }

    static void swim(Object fish) {
        if (!(fish instanceof Float nemo)) {
            System.out.print("Eat!");
        } else {
            System.out.print(nemo);
        }
    }
    static void eat(Object fish) {
        if ((fish instanceof String guppy)) {
            System.out.print(guppy);
        } else {
            System.out.print("Swim!");
        }
    }
    public static void main(String[] args) {
        //swim((float)9f);
        eat((int)9);
    }
}