package org.example.model;

import org.example.util.Constant;
import org.example.util.PositionValidator;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece{
    @Override
    public List<String> getPossibleMoves(String position) {

        List<Integer> rc = getRowColumn(position);
        int row = rc.get(0);
        int column = rc.get(1);

        List<String> possibleMoves = new ArrayList<>();

        //possible rows Pawn can go
        for (int i = 0; i < Constant.BOARD_SIZE; i++)
        {
            String pos = String.valueOf((char) row) + (i + 1);
            if(!pos.equals(position) && PositionValidator.validatePosition(pos))
                possibleMoves.add(pos);
        }

        //possible columns Pawn can go
        for (int i = 0; i < Constant.BOARD_SIZE; i++)
        {
            //ascii value of A is 65
            String pos = String.valueOf((char) (65 + i)) + column;
            if(!pos.equals(position) && PositionValidator.validatePosition(pos))
                possibleMoves.add(pos);
        }

        return possibleMoves;
    }
}
