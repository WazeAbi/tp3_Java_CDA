package exo2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Forme forme = new Forme();
        forme.creer();
        System.out.println(forme.afficher());
        forme.deplacer(12,-12);
        System.out.println(forme.afficher());
        forme.verifier();
    }
}
