package org.example.model;

import org.example.util.PositionValidator;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece{
    @Override
    public List<String> getPossibleMoves(String position) {

        List<Integer> rc = getRowColumn(position);
        int row = rc.get(0);
        int column = rc.get(1);

        List<String> possibleMoves = new ArrayList<>();

        String pos = String.valueOf((char) (row + 1)) + column;
        if(!pos.equals(position) && PositionValidator.validatePosition(pos))
            possibleMoves.add(pos);

        return possibleMoves;
    }
}
