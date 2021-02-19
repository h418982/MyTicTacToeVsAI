package tictactoe;

import tictactoe.Player;

public class HumanPlayer extends Player{

    public String playerName = "Player";

    public static final char SYMBOL = 'O';
    public static final int ID = 1;

    public HumanPlayer(){
        super(ID);
    }

    public boolean makeAMove(TTTBoard board, int i, int j){
        if(!board.squareIsEmpty(i,j)){
            return false;
        }
        board.setSquare(i,j, Player.HUMAN);
        return true;
    }

    public char getPlaySymbol(){
        return SYMBOL;
    }

    public String toString(){
        return playerName;
    }

    public int getID(){
        return ID;
    }
}
