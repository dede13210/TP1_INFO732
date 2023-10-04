import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Combatant asterix = new Combatant("m670574tho150","La gaule","Asterix","23 rue du chene","Epeiste");
        Combatant obelix = new Combatant("m660574tho135","Le gros","Obelix","24 rue du chene","Berserker");
        NonCombatant panoramix = new NonCombatant("m251074tho51","Magicum","Panoramix","15 rue des pretre");
        Quartier lenclume = new Quartier("l'enclume",new ArrayList<String>(Arrays.asList("F111111","F000000")),new ArrayList<Habitant>(Arrays.asList(asterix,obelix,panoramix)));

        while (true){
            System.out.println();
        }
    }
}