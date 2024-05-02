public class BaseballCard {

    String name; // the name of the player on the card.
    int year; // the year the card was issued.

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    //Get the name.
    public String getName() {
        return name;
    }

    //Get the year.
    public int getYear() {
        return year;
    }

    //display the name + year in this string form. 
    @Override
    public String toString() {
        return "Baseball Card: [Name: " + name + ", Year: " + year + "]";
    }

    //Checks if one card is similar to the other.
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        BaseballCard other = (BaseballCard) obj;
        return name.equals(other.name) && year == other.year;
    }

    public static void main(String[] args) {

        //Here we have three cards to compare. We will compare the first card 
        //to the second and third. In the output, the first one should match
        //the third, but not the second.
        BaseballCard card1 = new BaseballCard("Player1", 1990);
        BaseballCard card2 = new BaseballCard("Player2", 1992);
        BaseballCard card3 = new BaseballCard("Player1", 1990);

        //Prints out the information of each card.
        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
        System.out.println("Card 3: " + card3);

        //Prints true/false on wether card1 equals cards 2 or 3.
        System.out.println("Card 1 equals Card 2? " + card1.equals(card2));
        System.out.println("Card 1 equals Card 3? " + card1.equals(card3));
    }
}
