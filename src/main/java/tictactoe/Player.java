package tictactoe;

public abstract class Player {
        public static final int HUMAN = 1;
        public static final int AI = 0;

        public int curPlayer;

        public Player (int player){
            this.setCurPlayer(player);
        }

        public char getPlaySymbol ( Player player){
            return player.getPlaySymbol();
        }

        public void setCurPlayer(int player){
            this.curPlayer = player;
        }

        public int getCurPlayer(){
            return this.curPlayer;
        }

        public abstract char getPlaySymbol();
        public abstract int getID();

}
