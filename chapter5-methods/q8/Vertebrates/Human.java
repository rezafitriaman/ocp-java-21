package Vertebrates;
import Vertebrates.Mamal;

public class Human extends Mamal {
    private int speedInKM = 45;
    public Human() {
        super("mamal", "warm-blooded", true);
    }

    public String swim() {
        return "I can swim " + speedInKM + " km/hour!";
    }
}