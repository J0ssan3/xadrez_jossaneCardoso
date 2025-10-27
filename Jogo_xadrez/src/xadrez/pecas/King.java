package xadrez.pecas;

import xadrez.PlayerColor;

public class King extends Piece {
    public King(PlayerColor color) {
        super(color, color == PlayerColor.WHITE ? 'K' : 'k');
    }

    @Override
    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        int dRow = Math.abs(endRow - startRow);
        int dCol = Math.abs(endCol - startCol);
        return dRow <= 1 && dCol <= 1;
    }
}
