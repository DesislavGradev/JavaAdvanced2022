package OOP.Lec1_WorkingWithAbstraction.Exercises.Task123.Cards;

public class Card {
    private CardSuits cardSuits;
    private CardRanks cardRanks;

    public Card(CardSuits cardSuits, CardRanks cardRanks) {
        this.cardSuits = cardSuits;
        this.cardRanks = cardRanks;
    }

    public int getPower() {
        return cardRanks.getRankPower() + cardSuits.getSuitPower();
    }

    public CardSuits getCardSuits() {
        return cardSuits;
    }

    public CardRanks getCardRanks() {
        return cardRanks;
    }
}
