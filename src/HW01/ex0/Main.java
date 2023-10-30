package HW01.ex0;

import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class Main {
        public static void main(String[] args) {
            List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
            Hero emmett = new Hero("Emmett", 55, "sword", heroBag, true);
            testCheckingHeroAssert(emmett);
            System.out.print(emmett.def);
        }


    public static void testCheckingHeroAssert(Hero emmett){
    assert emmett.name == "emmett" : "Имя не Emmett";
    assert emmett.def == 50 : "Защита не 50";
    assert emmett.typeWeapon =="sword" : "Оружие не меч";
    assert emmett.Bag.size() == 3 : "В рюкзаке не 3 вещи";
    assert emmett.Bag.contains("Bow")
            & emmett.Bag.contains("Axe")
            & emmett.Bag.contains("Gold")
            : "В рюкзаке не те вещи";
    assert emmett.heroTypeHuman == true : "не человек";
}
}
