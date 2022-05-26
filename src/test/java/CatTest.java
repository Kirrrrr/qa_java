import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class CatTest {

    @Test
    public void shouldCatMeowSound() {
        Cat cat = new Cat(new Feline());
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCatEatMeat() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> actual = cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }
}
