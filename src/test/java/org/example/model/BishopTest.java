package org.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BishopTest {

    private Bishop bishop;

    @BeforeEach
    void setUp() {
        bishop = new Bishop();
    }

    @Test
    void getPossibleMoves_middlePositionD5_verifyPositions() {
        List<String> actualResult = bishop.getPossibleMoves("D5");
        List<String> expectedResult = new ArrayList<>(Arrays.asList("E6","F7","G8","E4","F3","G2","H1","C4","B3","A2","C6","B7","A8"));
        assertEquals(expectedResult.size(), actualResult.size());
        assertLinesMatch(expectedResult, actualResult);
    }

    @Test
    void getPossibleMoves_cornerPositionH1_verifyPositions() {
        List<String> actualResult = bishop.getPossibleMoves("H1");
        List<String> expectedResult = new ArrayList<>(Arrays.asList("G2","F3","E4","D5","C6","B7","A8"));
        assertEquals(expectedResult.size(), actualResult.size());
        assertLinesMatch(expectedResult, actualResult);
    }

    @Test
    void getPossibleMoves_firstColumnPositionD1_verifyPositions() {
        List<String> actualResult = bishop.getPossibleMoves("D1");
        List<String> expectedResult = new ArrayList<>(Arrays.asList("E2","F3","G4","H5","C2","B3","A4"));
        assertEquals(expectedResult.size(), actualResult.size());
        assertLinesMatch(expectedResult, actualResult);
    }

    @Test
    void getPossibleMoves_lastColumnPositionC8_verifyPositions() {
        List<String> actualResult = bishop.getPossibleMoves("C8");
        List<String> expectedResult = new ArrayList<>(Arrays.asList("D7","E6","F5","G4","H3","B7","A6"));
        assertEquals(expectedResult.size(), actualResult.size());
        assertLinesMatch(expectedResult, actualResult);
    }
}