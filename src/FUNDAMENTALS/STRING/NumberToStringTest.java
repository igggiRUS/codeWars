package FUNDAMENTALS.STRING;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberToStringTest {
    @Test
    public void sampleTests() {
            assertEquals("67", KataNumberToString.numberToString(67));
            assertEquals("123", KataNumberToString.numberToString(123));
            assertEquals("999", KataNumberToString.numberToString(999));
        }
    }