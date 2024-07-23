package LLD.TicTacToe;

import LLD.TicTacToe.Model.Board;
import LLD.TicTacToe.Model.Player;
import LLD.TicTacToe.Model.PlayingPieceO;
import LLD.TicTacToe.Model.PlayingPieceX;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {

    private Board board;
    private Deque<Player> deque;

    public TicTacToeGame(){

        initialize();
    }

    private void initialize(){
        board = new Board(3);
        deque = new LinkedList<>();

        Player player1 = new Player("Player 1", new PlayingPieceX());
        Player player2 = new Player("Player 2", new PlayingPieceO());

        deque.offer(player1);
        deque.offer(player2);
    }

    public String startGame(){

        Scanner cin = new Scanner(System.in);

        boolean noWinner = true;

        while(noWinner){

            board.printBoard();

            Player player = deque.poll();

            boolean isFull = board.isFull();

            if(isFull){
                break;
            }

            System.out.print(player.getName() + "'s turn. Enter row and column : ");

            int row = cin.nextInt(), col = cin.nextInt();

            System.out.println();

            boolean placed = board.placePiece(row, col, player.getPiece());

            if(!placed){
                deque.offerFirst(player);
                System.out.println("Invalid Play! Try again");
                continue;
            }

            boolean won = isWinner();

            if(won){

                board.printBoard();
                return player.getName();
            }
            deque.offerLast(player);
        }

        board.printBoard();

        return "Tie";
    }
    private boolean isWinner(){

        int n = board.getSize();

        boolean row1 = true, row2 = true, col1 = true, col2 = true;
        boolean dia1 = true, dia2 = true;

        for(int i=0;i<n;i++){

            if(board.get(0,i) == null){
                row1 = false;
            }

            if(board.get(n-1, i)==null){
                row2 = false;
            }

            if(board.get(i,0)==null){
                col1 = false;
            }

            if(board.get(i,n-1)==null){
                col2 = false;
            }

            if(board.get(i,i)==null){
                dia1 = false;
            }

            if(board.get(i,n-1-i)==null){
                dia2 = false;
            }
        }

        return row1 || row2 || col1 || col2 || dia1 || dia2;

    }
}
