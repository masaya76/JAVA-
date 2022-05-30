package Collection_Class;

import java.util.ArrayList;
import java.util.List;

public class collection_Application {
    public static void main(String[] args) {
        List<Character> party = new ArrayList<Character>();
        party.add(new Soldier());
        party.add(new Playboy());

        collection_Application.partyAttack(party);
    }
    
    public static void partyAttack(List<Character> party) {
        for (Character character : party) {
            int hp = character.attack();
            System.out.println("HP : " + hp);
        }
    }
}
