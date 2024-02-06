package exo2;

import java.util.Scanner;

public class Forme {
    private int x;
    private int y;

    public void creer(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une valeur pour X ");
        int x = scanner.nextInt();
        while ((x<0) || (x>800)){
            System.out.println("Entrez une valeur comprise entre 0 et 800");
            x = scanner.nextInt();
        }
        setX(x);
        System.out.println("Entrez une valeur pour Y");
        int y = scanner.nextInt();
        while ((y<0) || (y>600)) {
            System.out.println("Entrez une valeur comprise entre 0 et 600");
            y = scanner.nextInt();
        }
        setY(y);
    }
    public String afficher(){
        return " "+getX()+ " "+getY();

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
