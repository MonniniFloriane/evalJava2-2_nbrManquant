import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(nbrManquant());
    }

    public static int nbrManquant() {
        int[] tab = {1, 2, 4, 5, 6};
        int nbrManquant = 0;

        for (int i : tab) {
            if (tab[i] == tab[i + 1]) {
                nbrManquant = tab[i + 1];
            }
        }
        return nbrManquant;
    }
}