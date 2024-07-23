package LLD.TicTacToe.Model;

public class Board {

    int rem;
    PlayingPiece[][] board;

    public Board(int size){

        this.rem = size * size;
        board = new PlayingPiece[size][size];
    }

    public boolean placePiece(int row, int col, PlayingPiece piece){

        if(board[row][col] != null){
            return false;
        }

        board[row][col] = piece;
        rem--;

        return true;
    }

    public boolean isFull(){
        return rem == 0;
    }

    public void printBoard(){

        for(int i=0;i<board.length;i++){

            for(int j=0;j<board[0].length;j++){

                if(board[i][j]==null){
                    System.out.print("   |");
                }else{
                    System.out.print(" " + board[i][j].type.name() + " |");
                }
            }

            System.out.println();
        }

    }

    public PlayingPiece get(int row,int col){
        return board[row][col];
    }

    public int getSize(){
        return board.length;
    }
}
