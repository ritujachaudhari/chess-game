package org.example;
import org.example.model.PieceType;
import org.example.util.PositionValidator;

import java.lang.String;
import java.util.List;
import java.util.Locale;

public class ChessApplication {

    public static void main(String args[]) throws Exception {
        String pieceType = args[0];
        String position = args[1];
        System.out.println("Piece Type : " + pieceType);
        System.out.println("Position : "+position);

        //validate inputs
        if(!PositionValidator.validatePosition(position))
            throw new Exception("Invalid position. Possible positions should contain row from A-H and column from 1-8");

        PieceType type = PieceType.valueOf(pieceType.toUpperCase(Locale.ROOT));

        List<String> possibleMoves = type.create().getPossibleMoves(position);

        System.out.println("Output : " + String.join(",",possibleMoves));
    }

}
