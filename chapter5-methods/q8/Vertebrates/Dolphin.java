package Vertebrates;

public class Dolphin extends Mamal {
    private int speedInKM = 60;
    public Dolphin() {
       super("mamal", "warm-blooded", true);
    }

    public String swim() {
        return "I can swim " + this.speedInKM + " km/hour!";
    }

    String printType() {
        return super.getType();
    }
}