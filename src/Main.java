import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] tab = {2, 3, 1, 5};
        System.out.println("Entrée : " + Arrays.toString(tab));
        System.out.println("Sortie : " + nbrManquant(tab) + "\n");

        int[] tab2 = {1, 2, 4, 5, 6, 8};
        System.out.println("Entrée : " + Arrays.toString(tab2));
        System.out.println("Sortie : " + nbrManquant(tab2));
    }

    public static List<Integer> nbrManquant(int[] tab) {
        int N              = tab.length + 1; //N+1
        List<Integer> list = new ArrayList<>(); //list vide pour les nbr manquant

        //Verifie les nbr manquant
        int nbrChercher = 1; //Pour commencer à 1
        for (int i : tab) {
            //Tant que le nbr chercher est plus petit que l'indice de tab
            while (nbrChercher < i) {
                list.add(nbrChercher); //Ajout du nbr manquant
                nbrChercher++;
            }
            nbrChercher++; //Passe au nbr suivant
        }
    return list;
    }
}