package ParcAutomobile;

public class Voiture extends Vehicule{
    @Override
    public String Démarer() {
       return "La voiture Démarre";
    }
    @Override
    public String Freiner() {
        return "Le voiture Freine";
    }

    @Override
    public String Arret() {
        return "Le voiture s'arrete";
    }
}
