package xadrez.pecas;

import xadrez.PlayerColor;

public class Rook extends Piece {
    public Rook(PlayerColor color) {
        super(color, color == PlayerColor.WHITE ? 'R' : 'r');
    }

    @Override
    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
        return startRow == endRow || startCol == endCol;
    }
}
