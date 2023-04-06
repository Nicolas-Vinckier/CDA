package Java.JAVA10;

import java.util.Scanner;

public class java10 {
    public static void main(String[] args) {
        System.out.println("Saisissez 5 entiers séparés par un espace :");
        Scanner entier = new Scanner(System.in);
        // Scanner lis les entrées utilisateur
        // entier instance qui stoque les valeurs
        // crée une nouvelle instance de la classe Scanner qui lit les entrées
        // utilisateur à partir de la console
        int[] tableau = new int[5];
        int n = 0;

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = entier.nextInt();
        }
        ;

        System.out.println("------------------------");
        System.out.println("Le tableau est :");
        // System.out.println(tableau);
        // on ne peut pas faire ça car on imprime l'emplacement mémoire
        // for (int i = 0; i < tableau.length; i++) {
        //     System.out.print(tableau[i] + " ");
        // }


    };
};

/*
 * JAVA10 : Trier un tableau d’entiers
 * 
 * Le but de ce TP est de produire un algorithme basé sur les instructions de
 * bases.
 * 
 * L'exercice consiste à trier un tableau de 5 entiers saisis par l’utilisateur.
 * 
 * Utiliser le scanner pour demander la saisie de 5 entiers.
 * 
 * Appelez 5 fois la méthode clavier.nextInt().
 * 
 * Pour chaque saisie, stocker le nombre dans un tableau en le triant par ordre
 * croissant.
 * 
 * Afficher la liste de ces entiers triée.
 * 
 * 
 * $ java TpJava10
 * Saisissez 5 entiers séparés par un espace : 5 15 2 9 1
 * Le tableau trié est : 1, 2, 5, 9, 15
 * 
 */