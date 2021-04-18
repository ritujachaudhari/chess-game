package org.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {

    private Horse horse;

    @BeforeEach
    void setUp() {
        horse = new Horse();
    }

    @Test
    void getPossibleMoves_middlePositionD5_verifyPositions() {
        List<String> actualResult = horse.getPossibleMoves("D5");
        List<String> expectedResult = new ArrayList<>(Arrays.asList("E3","C3","E7","C7","F6","F4","B6","B4"));
        assertEquals(expectedResult.size(), actualResult.size());
        assertLinesMatch(expectedResult, actualResult);
    }

    @Test
    void getPossibleMoves_cornerPositionH1_verifyPositions() {
        List<String> actualResult = horse.getPossibleMoves("H1");
        List<String> expectedResult = new ArrayList<>(Arrays.asList("G3","F2"));
        assertEquals(expectedResult.size(), actualResult.size());
        assertLinesMatch(expectedResult, actualResult);
    }

    @Test
    void getPossibleMoves_firstColumnPositionD1_verifyPositions() {
        List<String> actualResult = horse.getPossibleMoves("D1");
        List<String> expectedResult = new ArrayList<>(Arrays.asList("E3","C3","F2","B2"));
        assertEquals(expectedResult.size(), actualResult.size());
        assertLinesMatch(expectedResult, actualResult);
    }

    @Test
    void getPossibleMoves_lastColumnPositionC8_verifyPositions() {
        List<String> actualResult = horse.getPossibleMoves("C8");
        List<String> expectedResult = new ArrayList<>(Arrays.asList("D6","B6","E7","A7"));
        assertEquals(expectedResult.size(), actualResult.size());
        assertLinesMatch(expectedResult, actualResult);
    }
}