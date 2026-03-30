import com.example.util.StringUtill;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseLetterTest {
    //Проверка изначального задания
    @Test
    public void reverseLetterOriginalTest() {
        String result = StringUtill.reverseLetter("J@va the be$t!123");
        assertEquals(result, "t@eb eht av$J!123");
    }
    //Проверка пустой строки
    @Test
    public void reverseLetterEmptyStringTest() {
        String result = StringUtill.reverseLetter("");
        assertEquals(result, "");
    }
    // Проверка строки из одного символа буквы
    @Test
    public void reverseLetterSingleCharacterLetterTest() {
        String result = StringUtill.reverseLetter("J");
        assertEquals(result, "J");
    }
    // Проверка строки из одного символа НЕ буквы
    @Test
    public void reverseLetterSingleCharacterNotLetterTest() {
        String result = StringUtill.reverseLetter("@");
        assertEquals(result, "@");
    }
    //Проверка строки только из цифр
    @Test
    public void reverseLetterNumberOnlyTest() {
        String result = StringUtill.reverseLetter("1234567890");
        assertEquals(result, "1234567890");
    }
}
