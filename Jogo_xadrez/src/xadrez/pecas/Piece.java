package xadrez.pecas;

import xadrez.PlayerColor;

public abstract class Piece {
    protected PlayerColor color;
    protected char symbol;

    public Piece(PlayerColor color, char symbol) {
        this.color = color;
        this.symbol = symbol;
    }

    public PlayerColor getColor() {
        return color;
    }

    public char getSymbol() {
        return symbol;
    }

    public abstract boolean isValidMove(int startRow, int startCol, int endRow, int endCol);
}