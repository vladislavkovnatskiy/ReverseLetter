package com.example.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {
    @Test
    public void reverseLetterOriginalTest() {
        String result = StringUtill.reverseLetter("J@va the be$t!123");
        assertEquals(result, "t@eb eht av$J!123");
    }
    @Test
    public void reverseLetterEmptyStringTest() {
        String result = StringUtill.reverseLetter("");
        assertEquals(result, "");
    }
    @Test
    public void reverseLetterSingleCharacterLetterTest() {
        String result = StringUtill.reverseLetter("J");
        assertEquals(result, "J");
    }
    @Test
    public void reverseLetterSingleCharacterNotLetterTest() {
        String result = StringUtill.reverseLetter("@");
        assertEquals(result, "@");
    }
    @Test
    public void reverseLetterNumberOnlyTest() {
        String result = StringUtill.reverseLetter("1234567890");
        assertEquals(result, "1234567890");
    }
    @Test
    public void reverseLetterLettersOnlyTest() {
        String result = StringUtill.reverseLetter("JavaIsCOOL");
        assertEquals(result, "LOOCsIavaJ");
    }
}
