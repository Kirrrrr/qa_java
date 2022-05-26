import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class FelineTest {

    @Test
    public void whenDidntIndicateAmount_thenReturnOneKitten() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeFelineFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(actual, expected);
    }

    @Test
    public void shouldFelineEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(actual, expected);
    }

}
