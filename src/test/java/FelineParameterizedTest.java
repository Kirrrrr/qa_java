import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final int amount;
    private final int expected;

    public FelineParameterizedTest(int amount, int expected) {
        this.amount = amount;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensAmount() {
        return new Object[][] {
                { 1, 1 },
                { 2, 2 },
                { 0, 0 },
                { -1, -1} // Баг: можно передать отрицательные значения
        };
    }

    @Test
    public void shouldGetKittensAmount() {
        Feline feline = new Feline();
        int actual = feline.getKittens(amount);
        assertEquals(expected, actual);
    }

}
