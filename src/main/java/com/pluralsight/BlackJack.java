package com.pluralsight;

import java.util.Scanner;

public class BlackJack {

    //
    public static void main(String[] args) {
        Scanner scanner scanner = new Scanner (System.in);
       String [] players = new String;
        System.out.println("Please enter name of each player ");
        String name = scanner.nextLine();



            Deck deck = new Deck();
            Hand hand1 = new Hand();
            // deal 5 cards
            for(int I = 0; I < 5; i++) {
                // get a card from the deck
                Cards.Card card = deck.deal();

                // deal that card to the hand
                hand1.deal(card);
            }
            int handValue = hand1.getValue();
            System.out.println("This hand is worth " + handValue);
}
