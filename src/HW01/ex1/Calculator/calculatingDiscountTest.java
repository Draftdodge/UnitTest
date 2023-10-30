package HW01.ex1.Calculator;
import static org.assertj.core.api.Assertions.assertThat;
public class calculatingDiscountTest {
    public static void calculatingDiscountTest(){
        assertThat(Calculator.calculatingDiscount(50, 100)).isPositive(); //
    }
}
