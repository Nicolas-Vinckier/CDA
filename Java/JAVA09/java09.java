package Java.JAVA09;

public class java09 {
    public static void main(String[] args) {
        int[] tab = { 1, 5, 45, -1, 6, 8 };
        // int i = 0;
        int valeurMax = 0;
        int valeurActuel = 0;

        // while (i < tab.length) {
        // tab[i] = valeurActuel;
        // if (valeurActuel > valeurMax){
        // valeurActuel = valeurMax;
        // };
        // i++;
        // };
        for (int i : tab) {
            if (i > valeurMax) {
                valeurMax = i;
            }
        }
        System.out.println(valeurMax);
    }
}
