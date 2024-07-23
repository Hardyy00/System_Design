package LLD.TicTacToe.Model;

public class PlayingPiece {

    PieceType type;

    public PlayingPiece(PieceType type){
        this.type = type;
    }

    public PieceType getType(){
        return type;
    }
}
