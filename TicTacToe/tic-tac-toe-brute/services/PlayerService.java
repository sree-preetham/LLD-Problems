package services;

import entities.Board;
import entities.Player;

import java.util.Scanner;

public class PlayerService {
    private final Scanner scanner;
    public PlayerService(Scanner scanner){
        this.scanner = scanner;
    }
    public Player createPlayer(char token){
        String playerName = scanner.nextLine();
        return new Player(playerName, token);
    }
    public void move(Player player, Board board, int x, int y){
        board.getGrid()[x][y] = player.getToken();
    }
}
