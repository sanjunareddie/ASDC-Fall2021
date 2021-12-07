package com.chess.piece;

import com.chess.board.interfaces.IBoard;
import com.chess.piece.interfaces.ICoordinates;
import com.chess.piece.interfaces.IPiece;
import com.chess.piece.interfaces.IPieceExistence;

/**
 * @author Sanjuna Konda
 */

public abstract class Piece implements IPiece {
    private String pieceName;
    private int color;
    private IPieceExistence iPieceExistence;
    private ICoordinates iCoordinates;
    private ICoordinates endCoordinates;

    public Piece(ICoordinates iCoordinates, IPieceExistence pieceExistence, int color) {
        this.iCoordinates = iCoordinates;
        this.iPieceExistence = pieceExistence;
        this.color = color;
    }

    public Piece(String pieceName) {
        this.pieceName = pieceName;
    }

    @Override
    public String getPieceName(){
        return pieceName;
    }

    public abstract boolean isValidMove(IBoard board, ICoordinates iCoordinates, ICoordinates endCoordinates);

}
