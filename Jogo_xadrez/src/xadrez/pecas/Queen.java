package xadrez.pecas;

import xadrez.PlayerColor;

public class Queen extends Piece {
    public Queen(PlayerColor color) {
        super(color, color == PlayerColor.WHITE ? 'Q' : 'q');
    }

    @Override
    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        return (startRow == endRow || startCol == endCol) ||
               (Math.abs(endRow - startRow) == Math.abs(endCol - startCol));
    }
}
