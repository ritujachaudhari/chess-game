package org.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueenTest {

    private Queen queen;

    @BeforeEach
    void setUp() {
        queen = new Queen();
    }

    @Test
    void getPossibleMoves_middlePositionD5_verifyPositions() {
        List<String> actualResult = queen.getPossibleMoves("D5");
        List<String> expectedResult = new ArrayList<>(Arrays.asList("D1","D2","D3","D4","D6","D7","D8","A5","B5","C5","E5","F5","G5","H5","E6","F7","G8","E4","F3","G2","H1","C4","B3","A2","C6","B7","A8"));
        assertEquals(expectedResult.size(), actualResult.size());
        assertLinesMatch(expectedResult, actualResult);
    }

    @Test
    void getPossibleMoves_cornerPositionH1_verifyPositions() {
        List<String> actualResult = queen.getPossibleMoves("H1");
        List<String> expectedResult = new ArrayList<>(Arrays.asList("H2","H3","H4","H5","H6","H7","H8","A1","B1","C1","D1","E1","F1","G1","G2","F3","E4","D5","C6","B7","A8"));
        assertEquals(expectedResult.size(), actualResult.size());
        assertLinesMatch(expectedResult, actualResult);
    }

    @Test
    void getPossibleMoves_firstColumnPositionD1_verifyPositions() {
        List<String> actualResult = queen.getPossibleMoves("D1");
        List<String> expectedResult = new ArrayList<>(Arrays.asList("D2","D3","D4","D5","D6","D7","D8","A1","B1","C1","E1","F1","G1","H1","E2","F3","G4","H5","C2","B3","A4"));
        assertEquals(expectedResult.size(), actualResult.size());
        assertLinesMatch(expectedResult, actualResult);
    }

    @Test
    void getPossibleMoves_lastColumnPositionC8_verifyPositions() {
        List<String> actualResult = queen.getPossibleMoves("C8");
        List<String> expectedResult = new ArrayList<>(Arrays.asList("C1","C2","C3","C4","C5","C6","C7","A8","B8","D8","E8","F8","G8","H8","D7","E6","F5","G4","H3","B7","A6"));
        assertEquals(expectedResult.size(), actualResult.size());
        assertLinesMatch(expectedResult, actualResult);
    }
}