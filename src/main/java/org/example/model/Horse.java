package org.example.model;

import org.example.util.Constant;
import org.example.util.PositionValidator;

import java.util.ArrayList;
import java.util.List;

public class Horse extends Piece{
    @Override
    public List<String> getPossibleMoves(String position) {

        List<Integer> rc = getRowColumn(position);
        int row = rc.get(0);
        int column = rc.get(1);

        List<String> possibleMoves = new ArrayList<>();

        //go left
        int leftColumn = column - 2;
        if(leftColumn > 0)
        {
            calculateMoves(possibleMoves, position, row, leftColumn, +1, true);
            calculateMoves(possibleMoves, position, row, leftColumn, -1, true);
        }

        //go right
        int rightColumn = column + 2;
        if(rightColumn <= Constant.BOARD_SIZE)
        {
            calculateMoves(possibleMoves, position, row, rightColumn, +1, true);
            calculateMoves(possibleMoves, position, row, rightColumn, -1, true);
        }

        //go upward
        int upwardRow = row + 2;
        //ascii value of H is 72
        if(upwardRow <= 72){
            calculateMoves(possibleMoves, position, upwardRow, column, +1, false);
            calculateMoves(possibleMoves, position, upwardRow, column, -1, false);
        }

        //go downward
        int downwardRow = row - 2;
        //ascii value of A is 65
        if(upwardRow >= 65){
            calculateMoves(possibleMoves, position, downwardRow, column, +1, false);
            calculateMoves(possibleMoves, position, downwardRow, column, -1, false);
        }

        return possibleMoves;
    }

    private List<String> calculateMoves(List<String> possibleMoves, String position, int row, int column, int difference, boolean isHorizontal){
        String posDown = isHorizontal ? String.valueOf((char) (row + difference)) + column :String.valueOf((char) row) + (column + difference);
        if(!posDown.equals(position) && PositionValidator.validatePosition(posDown))
            possibleMoves.add(posDown);

        return possibleMoves;
    }
}
