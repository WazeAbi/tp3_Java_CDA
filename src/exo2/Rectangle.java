package exo2;

import java.util.Scanner;

public class Rectangle extends Forme{
    private int hauteurRectangle;
    private int longuerRectangle;

    public void creerRectangle(){
        Scanner scanner = new Scanner(System.in);
        int hauteur = scanner.nextInt();
        System.out.println("Entrez l'hauteur de votre rectangle");
        while (hauteur<0){
            System.out.println("Entrez une valeur supérieur a 0 ");
            hauteur=scanner.nextInt();
        }
        setHauteurRectangle(hauteur);
        int longeur =scanner.nextInt();
        System.out.println("Entrez une longeur pour votre rectangle");
        while (longeur<0){
            System.out.println("Entrez une valeur supérieur a 0 ");
            longeur=scanner.nextInt();
        }
        setLonguerRectangle(longeur);
    }
    public int getHauteurRectangle() {
        return hauteurRectangle;
    }

    public void setHauteurRectangle(int hauteurRectangle) {
        this.hauteurRectangle = hauteurRectangle;
    }

    public int getLonguerRectangle() {
        return longuerRectangle;
    }

    public void setLonguerRectangle(int longuerRectangle) {
        this.longuerRectangle = longuerRectangle;
    }


}
