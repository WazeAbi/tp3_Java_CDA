package ParcAutomobile;

public class Main {
    public static void main(String[] args) {
        Vehicule vehicule = new Voiture();
        vehicule.setPrix(100);
        vehicule.setImmatruculation("S1234W");
        System.out.println(vehicule.Arret());
        System.out.println(vehicule.getPrix());
    }
}
