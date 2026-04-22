package services;

import entities.Board;
import entities.Player;

import java.util.Scanner;

public class GameService {
    private Player playerOne;
    private Player playerTwo;
    private Board board;
    char playerOneDefault;
    char playerTwoDefault;
    private final BoardService boardService;
    private final PlayerService playerService;
    public GameService(Scanner scanner){
        this.boardService = new BoardService(scanner);
        this.playerService = new PlayerService(scanner);
        playerOneDefault = 'O';
        playerTwoDefault = 'X';
    }
    public void startGame(){
        this.board = boardService.createBoard(); // create board
        this.playerOne = playerService.createPlayer(playerOneDefault); // create player 1
        this.playerTwo = playerService.createPlayer(playerTwoDefault); // create player 2
        System.out.println("Players and Board created");
        Player winner = playGame();
        endGame(winner);
    }
    private Player playGame(){
        boolean flag = true;
        Player winner;
        Scanner scanner = new Scanner(System.in);
        while(true){
            Player player = flag ? this.playerOne : this.playerTwo;
            System.out.println(player.getName() + "'s turn. Enter x and y coordinates:");
            int x = Integer.parseInt(scanner.nextLine());
            int y = Integer.parseInt(scanner.nextLine());
            if(boardService.isValid(board, x, y)){
                playerService.move(player, this.board, x, y);
                if(boardService.isGameOver(this.board, player)){
                    winner = player;
                    break;
                } else if(boardService.isGameTied(this.board)){
                    winner = null;
                    break;
                }
                boardService.printBoard(this.board);
                flag = !flag;
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
        return winner;
    }
    private void endGame(Player winner){
        if(winner!=null) System.out.println(winner.getName() + " wins the game");
        else System.out.println("Game Tied");
    }
}
