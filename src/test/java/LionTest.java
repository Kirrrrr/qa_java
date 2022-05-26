import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class LionTest {

    @Test
    public void shouldMaleLionHasMane() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        boolean actual = lion.doesHaveMane();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFemaleLionNotHasMane() throws Exception {
        Lion lion = new Lion("Самка", new Feline());
        boolean actual = lion.doesHaveMane();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void whenDidntIndicateMale_thenThrowsException() throws Exception {
        Lion lion = new Lion("Мужчина", new Feline());
        lion.doesHaveMane();
    }

    @Test
    public void shouldLionGetKittens() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldLionEatMeat() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

}
