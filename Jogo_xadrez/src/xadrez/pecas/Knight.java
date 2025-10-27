package xadrez.pecas;

import xadrez.PlayerColor;

public class Knight extends Piece {
    public Knight(PlayerColor color) {
        super(color, color == PlayerColor.WHITE ? 'N' : 'n');
    }

    @Override
    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        int dRow = Math.abs(endRow - startRow);
        int dCol = Math.abs(endCol - startCol);
        return (dRow == 2 && dCol == 1) || (dRow == 1 && dCol == 2);
    }
}
