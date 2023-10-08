import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Combatant asterix = new Combatant("m670574tho150","La gaule","Asterix","23 rue du chene","Epeiste");
        Combatant obelix = new Combatant("m660574tho135","Le gros","Obelix","24 rue du chene","Berserker");
        NonCombatant panoramix = new NonCombatant("m251074tho51","Magicum","Panoramix","15 rue des pretre");
        Quartier lenclume = new Quartier("l'enclume",new ArrayList<String>(Arrays.asList("F111111","F000000")),new ArrayList<Habitant>(Arrays.asList(asterix,obelix,panoramix)));
        Village ellesia = new Village("ellesia",new ArrayList<>(Arrays.asList(lenclume)));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est le message de convocation de la prochaine bataille?");
        String message = scanner.nextLine();
        System.out.println(ellesia.toString());
        System.out.println("Quelle quartier voullez vous afficher?");
        String quartier = scanner.next();
        scanner.nextLine();
        try {
            Quartier objetQuartier = ellesia.trouverQuartier(quartier);

            ArrayList<Habitant> convoques = new ArrayList<Habitant>();
            objetQuartier.afficherHabitants();
            System.out.println("Rentrez le nombre de combattants à convoquer : ");
            int nbreaConvoqu = scanner.nextInt();


            for(int i=0; i<nbreaConvoqu; i++){
                System.out.println("nnig du combatant à convoquer");
                String nnig = scanner.next();
                scanner.nextLine();
                try {
                    objetQuartier.trouverHabitant(nnig).convoquer(message);
                    convoques.add(objetQuartier.trouverHabitant(nnig));

                }catch (NullPointerException e){
                    System.out.println("habitant non trouver");
                }
            }
            System.out.println(convoques);
        }catch (NullPointerException e){
            System.out.println("quartier non reconnus");
        }

    }
}