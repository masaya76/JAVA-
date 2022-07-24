package HighLow;

public class GameMain {
    public static void main(String[] args){
        Deck deck = new Deck();

        Player parent = new Player();
        parent.Draw(deck);
        
        Player child = new Player();
        parent.Draw(deck);

        new Display(parent, child);
        return;
    }
}
