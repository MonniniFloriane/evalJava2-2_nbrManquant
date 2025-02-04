import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tab = {1, 2, 4, 5, 6};
        System.out.println("Entrée : " + Arrays.toString(tab));

        int nbrManquant = nbrManquant(tab);
        System.out.println("Sortie : " + nbrManquant);
    }

    public static int nbrManquant(int[] tab) {
        int N = tab.length + 1;
        int sum = N * (N - 1) / 2;
        int sumTab = 0;

        for (int i : tab) {
            sumTab += i;
        }
        return sumTab - sum;
    }
}