package com.chess.piece;

import com.chess.board.SquareBox;
import com.chess.board.interfaces.IBoard;
import com.chess.board.interfaces.ICoordinates;
import com.chess.piece.interfaces.IPieceExistence;
import com.chess.piece.interfaces.IRook;
import com.chess.utilities.Utility;

/**
 * @author Sanjuna Konda
 */

public class Rook extends Piece implements IRook {
    public Utility utility;

    public Rook(ICoordinates iCoordinates, IPieceExistence pieceExistence, int color) {
        super(iCoordinates, pieceExistence, color);
    }

    @Override
    public String getPieceName() {
        return utility.ROOK;
    }

    @Override
    public boolean isValidMove(IBoard board, SquareBox startPosition, SquareBox endPosition) {
        if(endPosition.getPiece().getPieceColor() == this.getPieceColor()) {
            return false;
        }
        if(startPosition.getCoordinates().getXCoordinate() == endPosition.getCoordinates().getXCoordinate()) {
            return true;
        } else if(startPosition.getCoordinates().getYCoordinate() == endPosition.getCoordinates().getYCoordinate()) {
            return true;
        }
        return false;
    }
}