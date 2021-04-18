package org.example.model;

public enum PieceType {
    KING(0){
        @Override
        public Piece create(){
            return new King();
        }
    },
    QUEEN(1){
        @Override
        public Piece create(){
            return new Queen();
        }
    },
    BISHOP(2){
        @Override
        public Piece create(){
            return new Bishop();
        }
    },
    HORSE(3){
        @Override
        public Piece create(){
            return new Horse();
        }
    },
    ROOK(4){
        @Override
        public Piece create(){
            return new Rook();
        }
    },
    PAWN(5){
        @Override
        public Piece create(){
            return new Pawn();
        }
    };

    private int typeId;
    PieceType(int typeId){
        this.typeId = typeId;
    }

    public int getTypeId(){
        return typeId;
    }

    public abstract Piece create();

}
