package com.pluralsight;

public class Hand {
        private ArrayList<Card> cards;
        public Hand(){
            this.cards = new ArrayList<>();
        }

        public void Deal(Card card){
            cards.add(card);
        }
        public int getSize(){
            return cards.size();
        }
        public int getValue(){
            int value = 0;

            for(Card card: cards){
                card.flip(); // turn the card over to see the value
                value += card.getPointValue();
                card.flip(); // hide the card again
            }
            return value;
}

}
