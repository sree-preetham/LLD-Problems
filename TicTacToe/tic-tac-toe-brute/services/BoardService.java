package services;

import entities.Board;
import entities.Player;

import java.util.Scanner;

public class BoardService {
    private final Scanner scanner;
    public BoardService(Scanner scanner){
        this.scanner = scanner;
    }
    public Board createBoard(){
        int boardSize = Integer.parseInt(scanner.nextLine());
        return new Board(boardSize);
    }
    public boolean isValid(Board board, int x, int y){
        char[][] grid = board.getGrid();
        return x >= 0 && y >=0 && x < grid.length && y < grid.length && grid[x][y] == '\0';
    }
    public boolean isGameOver(Board board, Player player){
        char token = player.getToken();
        char[][] grid = board.getGrid();
        int n = grid.length;
        // Check rows
        for(int i = 0; i < n; i++){
            boolean rowWin = true;
            for(int j = 0; j < n; j++){
                if(grid[i][j] != token){
                    rowWin = false;
                    break;
                }
            }
            if(rowWin) return true;
        }
        // Check columns
        for(int j = 0; j < n; j++){
            boolean colWin = true;
            for(int i = 0; i < n; i++){
                if(grid[i][j] != token){
                    colWin = false;
                    break;
                }
            }
            if(colWin) return true;
        }
        // Check main diagonal
        boolean diag1 = true;
        for(int i = 0; i < n; i++){
            if(grid[i][i] != token){
                diag1 = false;
                break;
            }
        }
        // Check anti-diagonal
        boolean diag2 = true;
        for(int i = 0; i < n; i++){
            if(grid[i][n - i - 1] != token){
                diag2 = false;
                break;
            }
        }
        return diag1 || diag2;
    }
    public boolean isGameTied(Board board){
        char[][] grid = board.getGrid();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                if(grid[i][j] == '\0') return false;
            }
        }
        return true;
    }
    public void printBoard(Board board){
        char[][] grid = board.getGrid();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                if(grid[i][j] == '\0') System.out.print(". ");
                else System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
