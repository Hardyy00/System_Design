package LLD.TicTacToe.Model;

public class Player {

    private String name;
    private PlayingPiece piece;

    public Player(String name, PlayingPiece type){
        this.name = name;
        piece = type;
    }

    public String getName(){
        return name;
    }

    public PlayingPiece getPiece(){
        return piece;
    }

    public void setPiece(PlayingPiece type){
        piece = type;
    }
}
