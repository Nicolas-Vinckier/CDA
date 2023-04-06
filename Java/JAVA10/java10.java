package Java.JAVA10;

import java.util.Arrays;
import java.util.Scanner;

public class java10 {
    public static void main(String[] args) {
        System.out.println("Saisissez 5 entiers séparés par un espace :");// texte
        Scanner entier = new Scanner(System.in); // explication en dessous
        // Scanner lis les entrées utilisateur
        // entier instance qui stoque les valeurs
        // crée une nouvelle instance de la classe Scanner qui lit les entrées
        // utilisateur à partir de la console
        int[] tableau = new int[5];// initialise le tableau
        // int n = 0;

        for (int i = 0; i < tableau.length; i++) { // tant que i est plus petit que la taille du tableau :
            tableau[i] = entier.nextInt(); // l'index actuel i est désormais égal à la valeur utilisateur saisie
        }

        System.out.println("------------------------");// juste de la décoration
        System.out.println("Le tableau est :"); // texte
        // System.out.println(tableau);
        // on ne peut pas faire ça car on imprime l'emplacement mémoire
        Arrays.sort(tableau);// range le tableau
        for (int i = 0; i < tableau.length; i++) {// tant que i est plus petit que la taille du tableau :
            System.out.print(tableau[i] + " ");// Permet d'afficher les éléments du tableau un par un sur la même ligne
        }

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