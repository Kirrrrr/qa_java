import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void shouldMaleLionHasMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actual = lion.doesHaveMane();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFemaleLionNotHasMane() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean actual = lion.doesHaveMane();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void whenDidntIndicateMale_thenThrowsException() throws Exception {
        Lion lion = new Lion("Мужчина", feline);
        lion.doesHaveMane();
    }

    @Test
    public void shouldLionGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldLionEatMeat() throws Exception {
        List <String> expected = List.of("Животные", "Птицы", "Рыба");
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(expected);
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }

}
