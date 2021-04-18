package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PieceTypeTest {

    @Test
    void getTypeId_bishopEnum_verifyTypeId() {
        assertEquals(2, PieceType.BISHOP.getTypeId());
    }

    @Test
    void create_kingEnum_verifyInstanceOf() {
        Piece piece = PieceType.KING.create();
        assertTrue(piece instanceof King);
    }

    @Test
    void create_queenEnum_verifyInstanceOf() {
        Piece piece = PieceType.QUEEN.create();
        assertTrue(piece instanceof Queen);
    }

    @Test
    void create_bishopEnum_verifyInstanceOf() {
        Piece piece = PieceType.BISHOP.create();
        assertTrue(piece instanceof Bishop);
    }

    @Test
    void create_horseEnum_verifyInstanceOf() {
        Piece piece = PieceType.HORSE.create();
        assertTrue(piece instanceof Horse);
    }

    @Test
    void create_pawnEnum_verifyInstanceOf() {
        Piece piece = PieceType.PAWN.create();
        assertTrue(piece instanceof Pawn);
    }
}