package com.example.board;

/**
 * Representa um tabuleiro de jogo.
 */
public class Board {
    private int size;

    public Board(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("O tamanho deve ser maior que zero.");
        }
        this.size = size;
    }

    /**
     * Retorna o tamanho do tabuleiro.
     * @return tamanho do tabuleiro
     */
    public int getSize() {
        return size;
    }
}
