import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer implements Playable {
    Scanner input;
    String nume;
    Symbol s;

    public HumanPlayer(Scanner input, String nume) {
        this.input = input;
        this.nume = nume;
    }

    public int[] getCoord() {
        int[] coord = new int[2];

        try {
            coord[0] = input.nextInt();
            coord[1] = input.nextInt();
            if (coord[0] > 2 || coord[0] < 0 || coord[1] > 2 || coord[1] < 0) {
                System.out.println("Invalid Input! Please choose between 0-2!");
                return getCoord();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! Please choose between 0-2!");
            input.nextLine();
            return getCoord();
        }
        return coord;
    }

    public Symbol getSymbol() {
        return s;
    }

    public void setSymbol(Symbol s) {
        this.s = s;
    }
}
