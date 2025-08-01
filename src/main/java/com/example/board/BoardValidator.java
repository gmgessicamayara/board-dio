package com.example.board;

/**
 * Classe responsável pela validação do tabuleiro.
 */
public class BoardValidator {

    /**
     * Verifica se o tabuleiro é válido.
     * @param board tabuleiro a ser validado
     * @return true se válido, false caso contrário
     */
    public boolean isValid(Board board) {
        if (board == null) {
            return false;
        }
        // Exemplo de refatoração: extraindo checagem em método privado
        return isSizeValid(board.getSize());
    }

    private boolean isSizeValid(int size) {
        return size >= 1 && size <= 9;
    }
}
