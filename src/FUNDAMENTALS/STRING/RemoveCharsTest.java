package FUNDAMENTALS.STRING;

import static org.junit.jupiter.api.Assertions.*;

class RemoveCharsTest {

    @org.junit.jupiter.api.Test
    void remove() {
        assertEquals("loquen", KataRemove.remove("eloquent"));
        assertEquals("ountr", KataRemove.remove("country"));
        assertEquals("erso", KataRemove.remove("person"));
        assertEquals("lac", KataRemove.remove("place"));
    }
}