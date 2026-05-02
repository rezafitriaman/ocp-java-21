package Vertebrates;
import Animal.Animal;

public class Mamal extends Animal {
    protected final boolean drinkMilk;
    public Mamal(String type, String blood, boolean hasBackBone) {
       super(type, blood, hasBackBone);
       drinkMilk = true;
    }

    public boolean drinkMilk() {
        return drinkMilk;
    }

    public static void main(String[] args) {
       //Mamal m = new Mamal("mamal", "warm-blooded", true);
       //System.out.println(m.getType());
    }
}