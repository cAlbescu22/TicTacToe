import java.util.Random;

public class Referee {
    PlayBoard playBoard;
    Playable pO;
    Playable pX;

    public Referee(PlayBoard p, Playable player1, Playable player2) {
        this.playBoard = p;
        Random r=new Random();
        if (r.nextBoolean()){
            this.pO=player1;
            player1.setSymbol(Symbol.X);
            this.pX=player2;
            player2.setSymbol(Symbol.O);
        }
        else
        {
            this.pO=player2;
            player2.setSymbol(Symbol.X);
            this.pX=player1;
            player1.setSymbol(Symbol.O);
        }


    }
    public void Start() {
        int counter = 0;
        boolean ok=false;
        while ((counter <= 9) || !ok) {
            if (counter % 2 == 0) {
                System.out.println(playBoard);
                int a[] = pO.getCoord();
                Symbol s = pO.getSymbol();
                if (playBoard.isEmpty(a)) {
                    playBoard.fill(a, s);
                    counter++;
                }


            } else {
                System.out.println(playBoard);
                int a[] = pX.getCoord();
                Symbol s = pX.getSymbol();
                if (playBoard.isEmpty(a)) {
                    playBoard.fill(a, s);
                    counter++;
                }
            }
            if (counter>=4 && counter<=8) {
                if (playBoard.getWinner().equals(Symbol.O)){
                    System.out.println("O wins");
                    System.out.println("+++++++++++++++++++++++++++++");
                    ok=true;
                } else if (playBoard.getWinner().equals(Symbol.X)){
                    System.out.println("X wins");
                    System.out.println("+++++++++++++++++++++++++++++");
                    ok=true;
                }

            } else if (counter==9) {
                System.out.println("Draw");
                System.out.println("+++++++++++++++++++++++++++++");
                ok=true;
            }
        }
    }
}
