package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ChessApplicationTest {

    @Test
    void main_invalidPositionInput_verifyExceptionMessage() {
        String[] args = new String[]{"King", "D9"};
        Exception exception = assertThrows(Exception.class, ()->ChessApplication.main(args));
        String expectedMessage = "Invalid position. Possible positions should contain row from A-H and column from 1-8";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage,actualMessage);
    }
}