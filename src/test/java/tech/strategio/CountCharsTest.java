package tech.strategio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountCharsTest {
    @BeforeEach
    void setup() {
        new CountChars();
    }

    @Test
    void test1() {
        assertEquals(6, CountChars.totalCount("abc"));
    }

    @Test
    void test2() {
        assertEquals(52, CountChars.totalCount("hello"));
    }

    @Test
    void test3() {
        assertEquals(0, CountChars.totalCount(""));
    }
}
