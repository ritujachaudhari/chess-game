package org.example.model;

import org.example.util.PositionValidator;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece{
    @Override
    public List<String> getPossibleMoves(String position) {

        List<Integer> rc = getRowColumn(position);
        int row = rc.get(0);
        int column = rc.get(1);

        int[] possibleRows = new int[3];
        int[] possibleColumns = new int[3];
        List<String> possibleMoves = new ArrayList<>();

        //King can move 1 step in all direction
        possibleRows[0] = row - 1;
        possibleRows[1] = row;
        possibleRows[2] = row + 1;

        possibleColumns[0] = column - 1;
        possibleColumns[1] = column;
        possibleColumns[2] = column + 1;

        for (int r :possibleRows) {
            for (int c: possibleColumns) {
                String pos = String.valueOf((char) r)+c;
                //Check if calculated position is withing board boundary
                if(!pos.equals(position) && PositionValidator.validatePosition(pos))
                    possibleMoves.add(pos);
            }
        }
        return possibleMoves;
    }
}
