package com.example.board;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoardValidatorTest {

    @Test
    void testIsValid() {
        Board validBoard = new Board(5);
        Board invalidBoard = new Board(15); // inválido porque > 9

        BoardValidator validator = new BoardValidator();

        assertTrue(validator.isValid(validBoard));
        assertFalse(validator.isValid(invalidBoard));
        assertFalse(validator.isValid(null));
    }
}
