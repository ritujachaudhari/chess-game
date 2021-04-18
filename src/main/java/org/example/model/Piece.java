package org.example.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {

    protected List<Integer> getRowColumn(String position){
        int row = position.charAt(0);
        int column = Integer.parseInt(String.valueOf(position.charAt(1)));
        List<Integer> result = new ArrayList<>();
        result.add(row);
        result.add(column);
        return result;
    }

    public abstract List<String> getPossibleMoves(String position);
}
