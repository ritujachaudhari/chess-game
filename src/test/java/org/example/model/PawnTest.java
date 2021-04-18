package org.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PawnTest {
    private Pawn pawn;

    @BeforeEach
    void setUp() {
        pawn = new Pawn();
    }

    @Test
    void getPossibleMoves_startPosition_validOutput() {
        List<String> actualResult = pawn.getPossibleMoves("A5");
        assertLinesMatch(new ArrayList<>(Arrays.asList("B5")), actualResult);
    }

    @Test
    void getPossibleMoves_middlePosition_validOutput() {
        List<String> actualResult = pawn.getPossibleMoves("D5");
        assertLinesMatch(new ArrayList<>(Arrays.asList("E5")), actualResult);
    }

    @Test
    void getPossibleMoves_lastPosition_validOutput() {
        List<String> actualResult = pawn.getPossibleMoves("H5");
        assertLinesMatch(new ArrayList<>(), actualResult);
    }
}
