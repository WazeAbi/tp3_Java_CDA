package ParcAutomobile;

public class Camion extends Vehicule {
    @Override
    public String Démarer() {
        return "Le camion Démarre";
    }

    @Override
    public String Freiner() {
        return "Le Camion Freine";
    }

    @Override
    public String Arret() {
        return "Le Camion s'arrete";
    }
}
