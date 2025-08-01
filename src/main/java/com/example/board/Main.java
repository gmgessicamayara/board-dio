package com.example.board;

public class Main {
    public static void main(String[] args) {
        try {
            Board board = new Board(9);
            BoardValidator validator = new BoardValidator();

            if (validator.isValid(board)) {
                System.out.println("Tabuleiro válido com tamanho: " + board.getSize());
            } else {
                System.out.println("Tabuleiro inválido.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
