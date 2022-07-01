package OOP.Lec1_WorkingWithAbstraction.Exercises.Task123.Cards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Card Suits:");
//        Arrays.stream(CardSuit.values())
//                .forEach(cardSuit -> System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuit.ordinal(), cardSuit.name()));
//        System.out.println("Card Ranks:");
//        for (CardRanks cardRank : CardRanks.values()) {
//            System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name());
//        }
        Scanner scanner = new Scanner(System.in);

        CardRanks cardRanks = CardRanks.valueOf(scanner.nextLine());
        CardSuits cardSuits = CardSuits.valueOf(scanner.nextLine());

        Card card = new Card(cardSuits, cardRanks);

        System.out.printf("Card name: %s of %s; Card power: %d", card.getCardRanks(), card.getCardSuits(), card.getPower());

    }
}

