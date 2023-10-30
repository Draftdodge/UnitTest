package HW01.ex0;

import java.util.*;

public class Hero {
    String name;
    int def;
    String typeWeapon;

    List<String> Bag;

    boolean heroTypeHuman;
    public Hero(String name, int def, String typeWeapon, List<String> Bag, boolean heroTypeHuman) {
       this.name = name;
       this.def = def;
       this.typeWeapon = typeWeapon;
       this.Bag = Bag;
       this.heroTypeHuman = heroTypeHuman;



    }
}
