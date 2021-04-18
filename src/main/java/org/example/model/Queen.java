package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece{

    @Override
    public List<String> getPossibleMoves(String position) {

        List<String> possibleMoves = new ArrayList<>();

        PieceType[] pieces = {
                PieceType.ROOK,
                PieceType.BISHOP
        };
        for (PieceType piece : pieces) {
            possibleMoves.addAll(piece.create().getPossibleMoves(position));
        }

        return possibleMoves;
    }
}
