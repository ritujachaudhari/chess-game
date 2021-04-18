package org.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KingTest {
    private King king;

    @BeforeEach
    void setUp() {
        king = new King();
    }

    @Test
    void getRowColumn() {
        List<Integer> rc = king.getRowColumn("A8");
        assertEquals(rc.get(0),65); //ascii value of A
        assertEquals((char) rc.get(0).intValue(),'A');
        assertEquals(rc.get(1),8);
    }

    @Test
    void getPossibleMoves_middlePositionD5_verifyPositions() {
        List<String> actualResult = king.getPossibleMoves("D5");
        List<String> expectedResult = new ArrayList<>(Arrays.asList("C4","C5","C6","D4","D6","E4","E5","E6"));
        assertEquals(expectedResult.size(), actualResult.size());
        assertLinesMatch(expectedResult, actualResult);
    }

    @Test
    void getPossibleMoves_cornerPositionH1_verifyPositions() {
        List<String> actualResult = king.getPossibleMoves("H1");
        List<String> expectedResult = new ArrayList<>(Arrays.asList("G1","G2","H2"));
        assertEquals(expectedResult.size(), actualResult.size());
        assertLinesMatch(expectedResult, actualResult);
    }

    @Test
    void getPossibleMoves_lastRowPositionH5_verifyPositions() {
        List<String> actualResult = king.getPossibleMoves("H5");
        List<String> expectedResult = new ArrayList<>(Arrays.asList("G4","G5","G6","H4","H6"));
        assertEquals(expectedResult.size(), actualResult.size());
        assertLinesMatch(expectedResult, actualResult);
    }
}