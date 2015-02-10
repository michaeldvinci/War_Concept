/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war.concept;

import java.util.*;

public class War {

    public static void createDeck(int[][] deck, int[] deck1d) {
        int k = 0;

        for (int[] deck1 : deck) {
            for (int j = 0; j < deck1.length; j++) {
                deck1[j] = j + 2; //sets each row to a value of 2-1
                deck1d[k] = deck1[j];
                k++;
            }
        }
    }

    public static void shuffleDeck(int[] deck1d, Stack deckS) {
        Random rnd = new Random();

        for (int d = deck1d.length - 1; d > 0; d--) {
            int index = rnd.nextInt(d + 1);

            int a = deck1d[index];
            deck1d[index] = deck1d[d];
            deck1d[d] = a;
        }
        
        for (int i = 0; i < deck1d.length; i++) {
            deckS.push(deck1d[i]);
        }
    }

    public static void deal(Stack deckS, Stack p1S, Stack p2S) {
        int hand = 1;
        int count = 0;

        while (count < 52) {
            if (hand == 1) {
                p1S.push(deckS.pop());
                hand = 2;
                count++;
            }
            else {
                p2S.push(deckS.pop());
                hand = 1;
                count++;
            }
        }
    }
    
    public static void playHands(Stack p1S, Stack p2S) {
        int p1, p2, p1Score = 0, p2Score = 0;
        
        for(int l = 0; l < 26; l++) {
            p1 = (int)p1S.pop();
            p2 = (int)p2S.pop();
            System.out.print("p1: " + p1 + " | " + p2 + " :p2\n");
            if (p1 > p2) {
                System.out.println("Player 1 gets the point!\n");
                p1Score++;
            }
            else {
                System.out.println("Player 2 gets the point!\n");
                p2Score++;
            }
        }
        if (p1Score > p2Score) {
            System.out.print("\nPlayer 1 wins!\n\n");
        }
        else {
            System.out.print("\nPlayer 2 wins!\n\n"); 
        }
    }
}
