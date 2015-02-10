/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war.concept;

import java.util.Stack;
import static war.concept.War.createDeck;
import static war.concept.War.deal;
import static war.concept.War.playHands;
import static war.concept.War.shuffleDeck;

/**
 *
 * @author michaeldvinci
 */
public class Driver {
    
    public static void main(String[] args) {
        int[][] deck;
        int[] deck1d;
        Stack p1S, p2S, deckS;

        deck = new int[4][13];
        deck1d = new int[52];
        p1S = new Stack();
        p2S = new Stack();
        deckS = new Stack();

        createDeck(deck, deck1d);
        shuffleDeck(deck1d, deckS);
        deal(deckS, p1S, p2S);
        playHands(p1S, p2S);
    }
}
