import services.GameService;

import java.util.Scanner;


public class TicTacToeBrute {
    public static void main(String[] args){
        System.out.println("Tic Tac Toe Game Brute Code");
        Scanner scanner = new Scanner(System.in);
        GameService gameService = new GameService(scanner);
        gameService.startGame();
    }
}
