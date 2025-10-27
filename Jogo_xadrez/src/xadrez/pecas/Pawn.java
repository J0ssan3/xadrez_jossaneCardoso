package xadrez.pecas;

import xadrez.PlayerColor;

public class Pawn extends Piece {
    public Pawn(PlayerColor color) {
        super(color, color == PlayerColor.WHITE ? 'P' : 'p');
    }

    @Override
    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        int direction = (color == PlayerColor.WHITE) ? -1 : 1;
        return startCol == endCol && endRow - startRow == direction;
    }
}