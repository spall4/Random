//Name: Pallav Shah  Date: 7/16/15  Title: NBA
//Description: Asks user to add players for two teams and then prints the winner team and losing team with 
//             all players in it.

package nba;

import java.util.*;

public class NBA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ifAddPlayer;
        String playerName;
        //Construct Team Heat
        System.out.println("Creat the NBA team of Heats......  ");
        NBATeam heat = new NBATeam("Heat");
        System.out.print("Add a play to Heats? (yes/no): ");
        ifAddPlayer = input.next();

        while (ifAddPlayer.equalsIgnoreCase("yes")) {
            System.out.print("What is the name to be added? ");
            playerName = input.next();
            heat.addAPlayer(playerName);
            System.out.print("Add one more play to heats? (yes/no) : ");
            ifAddPlayer = input.next();
        }

        System.out.println("Creat the NBA team of Spurs......  ");
        NBATeam spurs = new NBATeam("Spurs");
        System.out.print("Add a play to Spurs? (yes/no): ");
        ifAddPlayer = input.next();

        while (ifAddPlayer.equalsIgnoreCase("yes")) {
            System.out.print("What is the name to be added? ");
            playerName = input.next();
            spurs.addAPlayer(playerName);
            System.out.print("Add one more play to Spurs? (yes/no) : ");
            ifAddPlayer = input.next();
        }

        System.out.println(" Game on now ...");
        for (int i = 0; i < 7; i++) {
            double j = Math.random();
            if (j > 0.5) {
                heat.winGame();
                spurs.loseGame();
            } else {
                heat.loseGame();
                spurs.winGame();
            }

        }
        if (heat.winNumber() > spurs.winNumber() || spurs.winNumber() > heat.winNumber()) {
            if (heat.winNumber() > spurs.winNumber()) {
                System.out.println(heat.teamName() + "  ***WIN the series***");
            } else {
                System.out.println(spurs.teamName() + "  ***WIN the series***");
            }
        }

        System.out.println(heat.toString());
        System.out.println(spurs.toString());

    }

}
