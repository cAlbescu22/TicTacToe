import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);

        Referee r=new Referee(new PlayBoard(),
                new HumanPlayer(input,"Gigel"),
                new HumanPlayer(input,"Ionel"));
        r.Start();
        

    }
}
