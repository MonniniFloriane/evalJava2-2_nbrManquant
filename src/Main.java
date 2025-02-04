import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tab = {2, 3, 1, 5};
        System.out.println("Entrée : " + Arrays.toString(tab));
        System.out.println("Sortie : " + nbrManquant(tab));
    }

    public static int nbrManquant(int[] tab) {
        int N      = tab.length + 1;
        int sum    = N * (N + 1) / 2;
        int sumTab = 0;

        for (int i : tab) {
            sumTab += i;
        }

        return sum - sumTab;
    }
}