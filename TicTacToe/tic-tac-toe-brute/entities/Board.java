package entities;

public class Board {
    private char[][] grid;
    public Board(int n){
        this.grid = new char[n][n];
    }
    public char[][] getGrid(){
        return this.grid;
    }
}
