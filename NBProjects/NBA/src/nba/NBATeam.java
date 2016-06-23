//Name: Pallav Shah  Date: 7/16/15 Title: NBATeam class
// description: Blueprint for nba program
package nba;

import java.util.*;
public class NBATeam {
    private String sTeamName;
    private int nWin;
    private int nLoss;
    private int count = 0;
    private String [] playerArray = new String[1];
    private String [] temp = new String[1];
   
    
    public NBATeam(String name) {
        sTeamName = name;
    }
    
    public String teamName(){
        return sTeamName;
    }
    public void addAPlayer(String playerName){
    count++;
        if(count == 1) {
        playerArray [count-1] = playerName;
    for(int i = 0; i < playerArray.length; i++) {
             temp[i] = playerArray[i];
        }
    } else {
        playerArray = new String[count];
        for(int i = 0; i < temp.length; i++) {
            playerArray[i] = temp[i];
        }
        playerArray[count-1] = playerName;
        temp = new String[count];
        for(int i = 0; i < playerArray.length; i++) {
             temp[i] = playerArray[i];
        }
    }
        
    }
    
    public void winGame(){
        nWin++;
    }
    
    public int winNumber() {
        return nWin;
    }
    
    public void loseGame(){
        nLoss++;
    }
    
    @Override
   public String toString() {
       return sTeamName +"  "+ Arrays.toString(temp) + "  win : " + nWin +
               "  Lose : " + nLoss;
   }
}
