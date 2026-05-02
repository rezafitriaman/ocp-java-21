package Printer;
import Vertebrates.Dolphin;
import Vertebrates.Human;

public class Printer {
     public static void main(String[] args) {
         Dolphin d = new Dolphin();
         System.out.println(d.swim());

         Human h = new Human();
         System.out.println(h.swim());
         System.out.println(h.drinkMilk());
         System.out.println(h.getBlood());

     }
}