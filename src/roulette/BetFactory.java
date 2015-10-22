package roulette;

import java.util.ArrayList;
import java.util.List;
import roulette.bets.*;
import util.ConsoleReader;

public class BetFactory {
    List<Bet> bets = new ArrayList<Bet>();
    
    public BetFactory() {
        bets.add(new RedBlack("Red or Black", 1));
        bets.add(new OddEven("Odd or Even", 1));
        bets.add(new ThreeConsecutive("Three in a Row", 11));
    }
    
    /**
     * Prompt the user to make a bet from a menu of choices.
     */
    public Bet promptForBet () {
        System.out.println("You can make one of the following types of bets:");
        for (int k = 0; k < bets.size(); k++) {
            System.out.println(String.format("%d) %s", (k + 1), bets.get(k)));
        }
        int response = ConsoleReader.promptRange("Please make a choice", 1, bets.size());
        return bets.get(response - 1);
    }

}
