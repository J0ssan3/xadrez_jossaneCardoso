package xadrez;

import javax.swing.JOptionPane;
import xadrez.pecas.*;

public class Game {
    private ChessBoard board;
    private PlayerColor currentPlayer;

    public Game() {
        board = new ChessBoard();
        currentPlayer = PlayerColor.WHITE;
    }

    public void start() {
        while (true) {
            JOptionPane.showMessageDialog(null, board.display() +
                "\nTurn: " + currentPlayer);

            String from = JOptionPane.showInputDialog("Digite a posição de origem (ex: e2):");
            String to = JOptionPane.showInputDialog("Digite a posição de destino (ex: e4):");

            if (from == null || to == null) break;

            int startRow = 8 - Character.getNumericValue(from.charAt(1));
            int startCol = from.charAt(0) - 'a';
            int endRow = 8 - Character.getNumericValue(to.charAt(1));
            int endCol = to.charAt(0) - 'a';

            Piece piece = board.getPiece(startRow, startCol);
            if (piece == null) {
                JOptionPane.showMessageDialog(null, "Não há peça nessa posição!");
                continue;
            }

            if (piece.getColor() != currentPlayer) {
                JOptionPane.showMessageDialog(null, "Essa peça não é sua!");
                continue;
            }

            if (!piece.isValidMove(startRow, startCol, endRow, endCol)) {
                JOptionPane.showMessageDialog(null, "Movimento inválido!");
                continue;
            }

            board.movePiece(startRow, startCol, endRow, endCol);
            currentPlayer = (currentPlayer == PlayerColor.WHITE) ? PlayerColor.BLACK : PlayerColor.WHITE;
        }
    }
}
