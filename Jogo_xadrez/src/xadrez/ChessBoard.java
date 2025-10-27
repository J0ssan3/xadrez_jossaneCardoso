package xadrez;

import xadrez.pecas.*;

public class ChessBoard {
    private Piece[][] board;

    public ChessBoard() {
        board = new Piece[8][8];
        setupPieces();
    }

    private void setupPieces() {
        // Pretas
        board[0][0] = new Rook(PlayerColor.BLACK);
        board[0][1] = new Knight(PlayerColor.BLACK);
        board[0][2] = new Bishop(PlayerColor.BLACK);
        board[0][3] = new Queen(PlayerColor.BLACK);
        board[0][4] = new King(PlayerColor.BLACK);
        board[0][5] = new Bishop(PlayerColor.BLACK);
        board[0][6] = new Knight(PlayerColor.BLACK);
        board[0][7] = new Rook(PlayerColor.BLACK);
        for (int i = 0; i < 8; i++) board[1][i] = new Pawn(PlayerColor.BLACK);

        // Brancas
        board[7][0] = new Rook(PlayerColor.WHITE);
        board[7][1] = new Knight(PlayerColor.WHITE);
        board[7][2] = new Bishop(PlayerColor.WHITE);
        board[7][3] = new Queen(PlayerColor.WHITE);
        board[7][4] = new King(PlayerColor.WHITE);
        board[7][5] = new Bishop(PlayerColor.WHITE);
        board[7][6] = new Knight(PlayerColor.WHITE);
        board[7][7] = new Rook(PlayerColor.WHITE);
        for (int i = 0; i < 8; i++) board[6][i] = new Pawn(PlayerColor.WHITE);
    }

    public Piece getPiece(int row, int col) {
        return board[row][col];
    }

    public void movePiece(int startRow, int startCol, int endRow, int endCol) {
        board[endRow][endCol] = board[startRow][startCol];
        board[startRow][startCol] = null;
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append(8 - i).append(" ");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null)
                    sb.append("- ");
                else
                    sb.append(board[i][j].getSymbol()).append(" ");
            }
            sb.append("\n");
        }
        sb.append("  a b c d e f g h\n");
        return sb.toString();
    }
}
