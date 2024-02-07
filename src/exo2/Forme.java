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
    public void deplacer (int new_x , int new_y){
        this.x = new_x;
        this.y = new_y;
    }
    public void verifier(){
        if ((getX()<0 || getX()>800)&&(getY()<0 || getY()>600)) {
        System.out.println("Les valeurs de X et Y ne sont pas comprisent dans les bornes");
        }
        else if (getX()<0 || getX()>800){
            System.out.println("La valeurs de X n'est pas compris dans les bornes");
        } else if (getY()<0 || getY()>600) {
            System.out.println("La valeurs de Y n'est pas compris dans les bornes");
        }  else System.out.println("Les valeurs de X et y sont comprisent dans les bornes");
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
