package org.example.model;

import org.example.util.Constant;
import org.example.util.PositionValidator;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece{
    @Override
    public List<String> getPossibleMoves(String position) {

        List<Integer> rc = getRowColumn(position);
        int row = rc.get(0);
        int column = rc.get(1);

        List<String> possibleMoves = new ArrayList<>();

        //Go in top-right direction (+1 +1)
        for (int i = row + 1, j = column + 1; ((i-65)+1) <= Constant.BOARD_SIZE && j <= Constant.BOARD_SIZE; i++, j++){
            String pos = String.valueOf((char) i) + j;
            if(!pos.equals(position) && PositionValidator.validatePosition(pos))
                possibleMoves.add(pos);
        }

        //Go in top-left direction (+1 -1)
        for (int i = row + 1, j = column - 1; ((i-65)+1) <= Constant.BOARD_SIZE && j > 0; i++, j--){
            String pos = String.valueOf((char) i) + j;
            if(!pos.equals(position) && PositionValidator.validatePosition(pos))
                possibleMoves.add(pos);
        }

        //Go in bottom-left direction (-1 -1)
        for (int i = row - 1, j = column - 1; ((i-65)+1) > 0 && j > 0; i--, j--){
            String pos = String.valueOf((char) i) + j;
            if(!pos.equals(position) && PositionValidator.validatePosition(pos))
                possibleMoves.add(pos);
        }

        //Go in bottom-right direction (-1 +1)
        for (int i = row - 1, j = column + 1; ((i-65)+1) > 0 && j <= Constant.BOARD_SIZE; i--, j++){
            String pos = String.valueOf((char) i) + j;
            if(!pos.equals(position) && PositionValidator.validatePosition(pos))
                possibleMoves.add(pos);
        }

        return possibleMoves;
    }
}
