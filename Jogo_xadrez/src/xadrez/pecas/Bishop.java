package xadrez.pecas;

import xadrez.PlayerColor;

public class Bishop extends Piece {
    public Bishop(PlayerColor color) {
        super(color, color == PlayerColor.WHITE ? 'B' : 'b');
    }

    @Override
    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        return Math.abs(endRow - startRow) == Math.abs(endCol - startCol);
    }
}
