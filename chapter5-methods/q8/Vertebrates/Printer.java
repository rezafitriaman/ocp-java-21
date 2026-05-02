package Vertebrates;

public class Printer {
    public static final void main(String[] args) {
        Dolphin d = new Dolphin();
        System.out.println(d.swim());
        System.out.println(d.printType());
        System.out.println("----");

        Human h = new Human();
        System.out.println(h.swim());
        System.out.println(h.getBlood());
        System.out.println(h.drinkMilk());


    }
}